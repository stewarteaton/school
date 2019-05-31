package main

import (
    "database/sql"
    "log"
    "net/http"
    "text/template"
	"database/database"
	_ "github.com/go-sql-driver/mysql"
	
)

type Person struct {
    PersonID  int
    FirstName string
    LastName  string
    Birthdate  string
    BirthCity  string
    BirthState string
    Region string
}

func dbConn() (db *sql.DB) {
//Using your variables in database.go, establish a connection with your database
  //Call the handler db  - this is what you return below
  username := database.USR()
  password := database.PWD()
  db,err := sql.Open("mysql", username + ":" + password + "@/"+ username)

if err != nil {
	  panic(err.Error())
}
return db
	
}

var tmpl = template.Must(template.ParseGlob("templates/*"))



func Index(w http.ResponseWriter, r *http.Request) {
	//Connect to your database
	db := dbConn()
	//Select from people table - you only need PersonID, FirstName, and LastName
	row,err := db.Query("SELECT PersonID,FirstName,LastName FROM people")
	//Create a "results" slice of Person, adding each row from your query to this slice
	results := []Person{}

	var personID int
	var fname string 
	var lname string


	for row.Next(){
		err = row.Scan(&personID, &fname, &lname)
		if err != nil{
			panic(err.Error())
		}

		//append slice
		results = append(results, Person{PersonID: personID, FirstName: fname, LastName: lname})
	}
	
	//Execute template, sending "results" to index.html and defer closing db
    tmpl.ExecuteTemplate(w, "index.html", results)
    defer db.Close()
}

func Create(w http.ResponseWriter, r *http.Request) {
    //Execute template that will provide a form for adding a person
	tmpl.ExecuteTemplate(w, "create.html", nil)
}

func Add(w http.ResponseWriter, r *http.Request) {
    //This function is called AFTER the form in create.html is submitted
	//Verify there is a POST 
	db := dbConn()

	if r.Method == "POST" {
		
		FNAME := r.FormValue("FirstName")
		LNAME := r.FormValue("LastName")
		BIRTHDATE := r.FormValue("Birthdate")
		BIRTHCITY := r.FormValue("BirthCity")
		BIRTHSTATE := r.FormValue("BirthState")
		REGION := r.FormValue("Region")

			stmt,err := db.Prepare("INSERT INTO people (FirstName, LastName, Birthdate, BirthCity, BirthState, Region)VALUES(?,?,?,?,?,?)")

			if err != nil {
				panic(err.Error())
			}
			stmt.Exec(FNAME,LNAME,BIRTHDATE,BIRTHCITY,BIRTHSTATE,REGION)
		
			//Log updated information - will print to Command Line
			log.Println("ADDED: Name: " + FNAME + " " + LNAME)
			
	}
	
		
		
	//Defer closing database
	defer db.Close()

	//****************Redirect to index.html "/"
	http.Redirect(w,r,"/",301)

}

func Edit(w http.ResponseWriter, r *http.Request) {
	//This function is called AFTER a link to a specific person has been selected on the index.html page
	
	db := dbConn()
	//This function is editing a person so "Get" their "id" from the query string
	personID := r.URL.Query().Get("id")
	//Using this "id", query your database to get this person's information

	row,err := db.Query("SELECT PersonID,FirstName,LastName,Birthdate,BirthCity,BirthState,Region FROM people WHERE PersonID = ?",personID)
	if err != nil {
		panic(err.Error())
	}
	//Create a "onePerson" slice of Person, adding the one row from your query to this slice
	onePerson := []Person{}	
	//only one row but must use for syntax
	for row.Next(){
		var id int
		var fname string
		var lname string
		var birthdate string
		var birthcity string
		var birthstate string
		var region string
		//scan row to get values
		err = row.Scan(&id,&fname,&lname,&birthdate,&birthcity,&birthstate,&region)
		if err != nil {
			panic(err.Error())
		}


		onePerson = append(onePerson, Person{PersonID: id, FirstName: fname, LastName: lname,Birthdate: birthdate,BirthCity: birthcity,BirthState: birthstate, Region: region})
	}
   //Execute template, sending results to edit.html and defer closing db
   tmpl.ExecuteTemplate(w, "edit.html", onePerson)
   defer db.Close()
}

func Update(w http.ResponseWriter, r *http.Request) {
    //This function is called AFTER the form in edit.html is submitted
	
	db := dbConn()
	//This function will update a person's information so "Post" fields from the form
	if r.Method == "POST" {
		IDStr := r.FormValue("PersonID")
		FNAME := r.FormValue("FirstName")
		LNAME := r.FormValue("LastName")
		BIRTHDATE := r.FormValue("Birthdate")
		BIRTHCITY := r.FormValue("BirthCity")
		BIRTHSTATE := r.FormValue("BirthState")
		REGION := r.FormValue("Region")
		
		//Prepare a statement to Update people
		stmt,err := db.Prepare("UPDATE people SET FirstName=?, LastName=?,Birthdate=?,BirthCity=?,BirthState=?,Region=? WHERE PersonID = ?")
		if err != nil {
			panic(err.Error())
		}
	    //Execute statement using form values
		stmt.Exec(FNAME,LNAME,BIRTHDATE,BIRTHCITY,BIRTHSTATE,REGION,IDStr)
		
	
		//Log updated information - will print to Command Line
		log.Println("UPDATE: Name: " + FNAME + " " + LNAME + " | ID: " + IDStr)
	}
	//Defer closing database 

	defer db.Close()
	
	//****************Redirect to index.html "/"
	http.Redirect(w,r,"/",301)
	
}

func Delete(w http.ResponseWriter, r *http.Request) {
	//This function is called AFTER a link to a specific person has been selected on the index.html page
	
	db := dbConn()
	//This function is deleting a person so "Get" their "id" from the query string
	personID := r.URL.Query().Get("id")
	//Using this "id", prepare a statement to Delete From people
	stmt,err := db.Prepare("DELETE FROM people WHERE PersonID = ?")
	if err != nil {
		panic(err.Error())
	}
	//Execute statement using "id" as the criterion
	stmt.Exec(personID)
	
	//Log delete
    log.Println("DELETE")

	//Defer closing database 
	defer db.Close()
	//****************Redirect to index.html "/"
	http.Redirect(w,r,"/",301)	
}

func main() {
    log.Println("Server started on: http://localhost:8096")    
    http.HandleFunc("/", Index)
    http.HandleFunc("/create.html", Create)
    http.HandleFunc("/add", Add)
    http.HandleFunc("/edit.html", Edit)
    http.HandleFunc("/update", Update)
    http.HandleFunc("/delete.html", Delete)
	http.Handle("/home/sceaton/static/", http.StripPrefix("/home/sceaton/static/", http.FileServer(http.Dir("static"))))
    http.ListenAndServe(":8096", nil)			
}

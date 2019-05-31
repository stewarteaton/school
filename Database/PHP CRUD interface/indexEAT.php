<?php 

require_once("session.php"); 
require_once("included_functions.php");
require_once("database.php");
// verify_login();

// Connect to your database
new_header("Here is Who's Who!"); 
$mysqli = Database::dbConnect();
$mysqli -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
// Output a message, if there is one
if (($output = message()) !== null) {
	echo $output;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    Check whether username and password have been submitted from the index form. Verify the values are not empty


if (isset($_POST["submit"])) {
	
	if( (isset($_POST["username"]) && $_POST["password"] !== "")){
		
	    //Grab posted values for username and password.  
		//the function password_check, which returns true if the passwords match
		$userName = $_POST["username"];
		$passWord = $_POST["password"];
		
 
		//Check to make sure user does not already exist
		$query = "SELECT * FROM admins WHERE username = ? LIMIT 1";
		
		$stmt = $mysqli -> prepare($query);
		$stmt -> execute([$userName]);
		

		//Username found so now check password
		//If the attempted password matches the database password then set two $_SESSION variables
		//$_SESSION["username"]  & $_SESSION[admin_id"]
		//Redirect to readPeople.php

		if ($stmt) {		

			$row = $stmt->fetch(PDO::FETCH_ASSOC);
			
			if(password_check($passWord ,$row["hashed_password"])){
				$_SESSION["username"] = $row["username"];
				$_SESSION["admin"] = $row["id"];	
				
				redirect("readPeople.php");
			} 
			else {
				$_SESSION["message"] = "Username/Password NOT Found";
				redirect("indexEAT.php");				
			}
		
	    }
		
		//user name not found
 	    else {
			$_SESSION["message"] = "Username NOT Found";
			redirect("indexEAT.php");	
		 }
		}

		else{
			$_SESSION["message"] = "Error in form value";
			redirect("indexEAT.php");	
		}
	}


	  
	  
///////////////////////////////////////////////////////////////////////////////////////////////////////

?>

		<div class='row'>
		<label for='left-label' class='left inline'>
	
		<h3>Welcome!</h3>
		
<!--//////////////////////////////////////////////////////////////////////////////////////////////// -->
<!--    Create textboxes for Login -->

			
<form action="indexEAT.php" method="post">
 <p>Username:<input type="text" name="username" value="" /> </p>
 <p>Password: <input type="password" name="password" value="" /> </p>
 <input type="submit" name="submit" class="tiny round button" value="Log In" />
</form>

			
			

<!--//////////////////////////////////////////////////////////////////////////////////////////////// -->
				
</div>
</label>

<?php 
	
new_footer("Who's Who");
//Release query results
// $stmt -> close();
//Close database
Database::dbDisconnect();

?>
<?php 

require_once("session.php"); 
require_once("included_functions.php");
require_once("database.php");
//invoke verify_login
//Will redirect to indexABC.php if there is not a SESSION admin_id set
verify_login();

//Connect to your database
new_header("View Admins"); 
$mysqli = Database::dbConnect();
$mysqli -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);


//Output a message, if there is one
	if (($output = message()) !== null) {
		echo $output;
	}

	
	  
///////////////////////////////////////////////////////////////////////////////////////////////
//  Check to see if form submitted username and password text boxes are filled in.
//           If it has, verify username and password have been set and are not empty fields
		if (isset($_POST["submit"])) {
			if( (isset($_POST["username"]) && $_POST["password"] !== "")){
				//Grab posted values for username and password, encrypting the password
				//so that it is set up to compare with the encrypted password in the database
				//Use password_encrypt
				$userName = $_POST["username"];
				$passWord = $_POST["password"];
				$passWord = password_encrypt($passWord);

				//Query database for this "new" username
				$query = "SELECT * FROM admins WHERE username = ?";

				$stmt = $mysqli -> prepare($query);
				$stmt -> execute([$userName]);

					//If the username DOES exist in table, create a session message - "The username already exists"
					//Reidrect back to addLogin.php
				if ($stmt > 1) {
					$_SESSION["message"] = "Username already exists";
					redirect("addLogin.php");
					
				} else {
					$queryInsert = "INSERT INTO admins (username , hashed_password) VALUES(?,?)";
					$stmtInsert = $mysqli -> prepare($queryInsert);
					$stmtInsert -> execute([$userName, $passWord]);

					if($stmtInsert){
						$_SESSION["message"] = "User successfully added";
					} else {
						$_SESSION["message"] = "Could not add user";
					}

					redirect("addLogin.php");					
				}
			}
		} 


			
////////////////////////////////////////////////////////////////////////////////////////////////
?>
		
		<div class='row'>
		<label for='left-label' class='left inline'>

		<h3>Add an administrator to Who's Who!</h3>

<!--//////////////////////////////////////////////////////////////////////////////////////////////// -->
<!--   Create a form with textboxes for adding both a username and password -->
<form action="addLogin.php" method="post">
 <p>Username:<input type="text" name="username" value="" /> </p>
 <p>Password: <input type="password" name="password" value="" /> </p>
 <input type="submit" name="submit" class="tiny round button" value="Add Administrator" />
</form>

	
	
	
<!--///////////////////////////////////////////////////////////////////////////////////////////////// -->


			<p><br /><br /><hr />
			<h2>Current Admins</h2>

<!--//////////////////////////////////////////////////////////////////////////////////////////////// -->
<!--    Display current Administrators.  Also provide a link next to each person that allows you to delete -->
<!--     them from your database This requires including their id # in the query string -->
<?php
	//create query to select all fiels from admin table
		$query = "SELECT id, username, hashed_password FROM admins";
		$stmt = $mysqli -> prepare($query);
		$stmt -> execute();
		
		//if statement executed, create table displaying two cells in each row
		if($stmt){
			echo "<div class='row'>";
			echo "<center>";
			echo "<table>";
			echo "  <thead>";
			echo "    <tr><th>Name</th><th></th><th></th></tr>";
			echo "  </thead>";
			echo "  <tbody>";
			while($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
				echo "<tr>";
				//Output FirstName and LastName
				echo "<td> ".$row["username"]." </td>";
				?>
				<td><a href="deleteLogin.php?id=<?php echo urlencode($row["id"]);?>" onclick="return confirm('Are you sure you want to delete?');">Delete</a></td>
				<?php
			}
				echo "</tr>";
			echo "  </tbody>";
			echo "</table>";
			// echo "<br /><br /><a href='createPeople.php'>Add a person</a> | <a href='addLogin.php'>Add an admin</a> | <a href='logout.php'>Logout</a>";
			echo "</center>";
			echo "</div>";
		}
			
?>		
			
			
			

<!--//////////////////////////////////////////////////////////////////////////////////////////////// -->
			
  	  <?php echo "<br /><p>&laquo:<a href='readPeople.php'>Back to Main Page</a>"; ?>
			
	</div>
	</label>

<?php 
//Define footer with the phrase "Who's Who"
new_footer("Who's Who");
//Release query results
$stmt -> close();
//Close database
Database::dbDisconnect();

?>
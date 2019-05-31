<?php 

require_once("session.php"); 
require_once("included_functions.php");
require_once("database.php");
// required user session id to be set to access page
verify_login();

//Connect to your database
new_header("Delete from Who's who!"); 
$mysqli = Database::dbConnect();
$mysqli -> setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);



//Output a message, if there is one
	if (($output = message()) !== null) {
		echo $output;
	}
///////////////////////////////////////////////////////////////////////////////////
// Get this admins ID and delete from the database

if (isset($_GET["id"]) && $_GET["id"] !== "") {

	$query = "DELETE FROM admins WHERE id = ?";

	$stmt = $mysqli -> prepare($query);
	$stmt -> execute([$_GET["id"]]);

	if($stmt) {
		$_SESSION["message"] = "Successfully deleted user";
		echo "Person has been deleted";
	} else {
		$_SESSION["message"] = "Unable to delete user";
		echo "Person has been deleted";
	}
}

//////////////////////////////////////////////////////////////////////////////////


redirect("addLogin.php");	
	
new_footer("Who's Who");
//Release query results
$stmt -> close();
//Close database
Database::dbDisconnect();

?>
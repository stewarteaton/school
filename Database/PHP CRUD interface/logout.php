<?php 

require_once("session.php"); 
require_once("included_functions.php");
require_once("database.php");
verify_login();

//Connect to your database

if(!isset($_SESSION["admin"])) {
	$_SESSION["message"] = "You must login in first!";
	redirect("indexEAT.php");  
}

$_SESSION["message"] = "You have logged out!";


//Output a message, if there is one
if (($output = message()) !== null) {
	echo $output;
}
/////////////////////////////////////////////////////////////////////////////////////////
// Step 10.  Kill the session by setting the username and admin_id to null
$_SESSION["username"] = NULL;
$_SESSION["admin"] = NULL;

////////////////////////////////////////////////////////////////////////////////////////


 redirect("indexEAT.php");
 
 //DEFINE FOOTER
 new_footer("Who's Who");
 //Release query results
 $stmt -> close();
 //Close database
 Database::dbDisconnect();
 

 ?>

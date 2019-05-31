<?php

	session_start();
	
	function message() {
		if (isset($_SESSION["message"])) {
			
			$output = "<div class='row'>";
			$output .= "<div data-alert class='alert-box info round'>";
			$output .= htmlentities($_SESSION["message"]);
			$output .= "</div>";
			$output .= "</div>";
			
			// clear message after use
			$_SESSION["message"] = null;
			
			return $output;
		}
		else {
			return null;
		}
	}

	function errors() {
		if (isset($_SESSION["errors"])) {
			$errors = $_SESSION["errors"];
			
			// clear message after use
			$_SESSION["errors"] = null;
			
			return $errors;
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
//     
				//Verify the admin_id session variable has been set and is not null
				//If either case is false, create a session message "You must login in first"
				//and redirect to index.php

	function verify_login(){
		if(!isset($_SESSION["admin"])&& $_SESSION["admin"] === NULL){
			$_SESSION["message"] = "You must log in first!";
			redirect("indexEAT.php");							
			header("Location:indexEAT.php");
			exit;
		}
	}
				
///////////////////////////////////////////////////////////////////////////////////////////////////	
	
?>
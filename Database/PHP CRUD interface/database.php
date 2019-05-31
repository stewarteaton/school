<?php
class Database {
  private static $mysqli = null;

  public function __construct() {
    die('Init function error');
  }

  public static function dbConnect() {
    
      //imports variables from other file
      require_once('/home/sceaton/PHP/DBeaton.php');
      
      
      //try connecting to your database
      try{
//          $mysqli = new PDO('mysql:host=%s;dbname=%s',DBHOST,DBNAME,USERNAME, PASSWORD);
           $mysqli = new PDO('mysql:host='.DBHOST.';dbname='.DBNAME, USERNAME, PASSWORD);
          
          echo "Successful connection\n";

    //catch a potential error, if unable to connect
      } catch (PDOException $e) {
          echo "Could not connect\n";
          print $e->getMessage ();
          echo "\n";
      }
 
      return $mysqli;

  }

  public static function dbDisconnect() {
    $mysqli = null;
  }
}
?>

/* Course: CSCI 112, Section 2 
 * Student Name: Stewart Eaton 
 * Student ID: 10510831  
 * Program 2 (Homework)
Due Date: Sep 18th 2018
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.

Program Description: This program will simulate a game where the user is prompted to input number of sides 
for a given dice and the names of two players. There will be a continuous loop implemented which subtracts the number
of each player's roll from the starting number of 50 points. If the player goes under 1, then the roll number is added 
to current points. If the player lands on one, then he wins.
*/
package program2;

import java.util.Scanner;
public class GameSimulator {

	public static void main(String[] args) {
		//constant for starting points
		final int STARTING_POINTS = 50;
		
		//ask for number of sides of the die
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of sides of your die: ");
		int numS = scan.nextInt();
		
		scan.nextLine();
		
		//create a Die object with input from user
		Die dieSides = new Die(numS);
		
		//asks for players' names
		System.out.print("Enter name for player 1: ");
		String name1 = scan.nextLine();
		System.out.print("Enter name for player 2: ");
		String name2 = scan.nextLine();
		
		//create two Player objects with the names entered and starting points
		Player player1 = new Player(name1,STARTING_POINTS);
		Player player2 = new Player(name2,STARTING_POINTS);
		scan.close();
	
		//use a loop to play the game, you need to implement the methods (gameInPlay, takeTurn, determineWinner) first below
		//and call the methods here accordingly
		//while loop was used to keep simulating the players turn until a winner was determined
		while (gameInPlay(player1,player2)) {
			
			takeTurn(player1,dieSides);
			determineWinner(player1,player2);
			takeTurn(player2,dieSides);
			determineWinner(player1,player2);
		}
	}
	//gameInPlay method to determine if the game is still in play, this method takes two Player objects as arguments
	//it returns true/false; game is on if both players' points are not 1
	//method to check if one of the players points is 1 and game is over. would return false 
	public static boolean gameInPlay(Player player1, Player player2) {
		if (player1.getPoints() != 1 && player2.getPoints() !=1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//takeTurn method simulates a player's turn to roll the die, this method takes two arguments, a Player object and a Die object
	//it is void
	//roll the die, if a playerâ€™s points minus the value of the die is < 1, then the vale should be added to the playerâ€™s points;
	//otherwise, deduct the value from the player's points
	//the method should print out the player's name, the die value, and the player's points after rolling the die
	
	public static void takeTurn(Player player, Die die) {
		//call roll method for every turn
		die.roll();
		//if else statement to determine if points are subtracted or added depending on current score and roll made
		if ((player.getPoints() - die.getValue()) < 1) {
			int newPoints = player.getPoints() + die.getValue();
			player.setPoints(newPoints);
			
			System.out.printf("%s's turn: \n%s rolled a %d \n%s has %d point(s)\n\n", player.getName(),player.getName(),die.getValue(),player.getName(),newPoints);
		}
		else {
			int newPoints = player.getPoints() - die.getValue();
			player.setPoints(newPoints);
			
			System.out.printf("%s's turn: \n%s rolled a %d \n%s has %d point(s)\n\n", player.getName(),player.getName(),die.getValue(),player.getName(),newPoints);
		}
	}
	
	//determineWinnner method displays winner of the game, this method takes two Player objects as arguments
	//it is void
	//if a player1's points is 1, s/he is the winner; otherwise, player2 is the winner
	//the method prints out the winner's name
	
	/* add determineWinner method here */
	public static void determineWinner(Player player1,Player player2) {
		if (player1.getPoints() == 1) {
			System.out.printf("%s is the winner!", player1.getName());
		}else if(player2.getPoints() ==1) {
			System.out.printf("%s is the winner!", player2.getName());
		}
	}
}

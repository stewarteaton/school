/* Course:  CSCI 112, Section II
 Student Name: Stewart Eaton	
 Student ID: 10510831
 Program 1 (Homework)
 Due Date: 9/4/18
 
 In keeping with the Honor Code of UM, I have neither given nor received assistance
 from anyone other than the instructor.
 
 Program Description: This program will allow user to input a number in meters and convert that number to kilometers, inches, or feet. A loop will be used to keep promting conversion until user decides to quit.
 */
package todayNow;
import java.util.Scanner;

public class DistanceConverter {

	
	public static void main(String[] args) {
		//declare variable for user input conversion choice
		int choice=0;
		
		//Get user input for distance in meters
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a distance in meters: ");
		int a = reader.nextInt();
		
		//Create a menu of conversion options and use a while loop to keep asking user conversion choices until user wants to quit
		while (choice!=4) {
		System.out.println("\n1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit");
		
		System.out.println("\nEnter your choice (1-4): ");
		choice = reader.nextInt();
		
		//Set of "if" statements to respond to user conversion/input choice
		if (choice == 1) {
			double z = Math.round(convertKilometers(a) *100.0)/100.0;
			System.out.print(a+ " meters is "+z+" kilometers\n");
		}
		else if(choice ==2) {
			double z = Math.round(convertInches(a) *100.0)/100.0;
			System.out.print(a + " meters is "+z+" inches\n");
		}
		else if(choice ==3) {
			double z = Math.round(convertFeet(a) *100.0)/100.0;
			System.out.print(a+" meters is "+z+" feet\n");
		}
		//Allows user to exit loop
		else if(choice ==4) {
			System.out.print("\nBye!");
		
		}
		//Prompts user to input valid choice
		else {
			System.out.print("Invalid choice, enter choices (1-4)\n");
		}
		}
		
		//System.out.print("\nBye!");
	}
	
	//static methods for converting meters to other metrics
	public static double convertKilometers(int meters){
		return meters*.001;
	}
	public static double convertInches(int meters) {
		return meters*39.37;
	}
	public static double convertFeet(int meters) {
		return meters*3.281;
	}
}

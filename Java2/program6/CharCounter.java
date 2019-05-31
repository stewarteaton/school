package program6;
import java.util.Scanner;

/* Course: CSCI 112, Section 2 
 * Student Name: Stewart Eaton 
 * Student ID: 10510831  
 * Program 6 (Homework)
Due Date: November 14th 2018
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.

Program Description: In this program we prompt user to input a string and a character in the string to count the occurences of. 
Two public methods are created and called to complete this task iteratively and recursively 
*/

public class CharCounter {

	public static void main(String[] args) {
		//Create scanner  to get user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		System.out.print("Enter a character you want to find in the string: ");
		String s = scan.nextLine();
		//get character a string user inputed
		char c = s.charAt(0);

		//declare int =0 for starting point in recursion
		int i = 0;
		
		//call two methods with user input
		System.out.print("\nUse Iterative Method:");
		System.out.println("\n"+c+" occurs "+iterativeCharCount(input,c) +" time(s)");
		
		System.out.print("\nUse Recursive Method: ");
		System.out.println("\n"+c+" occurs "+recursiveCharCount(input,i,c) +" time(s)");
		
	}
	
	//iterative method using a loop and a counter to find number of occurences
	public static int iterativeCharCount(String str, char ch) {
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				counter+=1;
			}
		}
	
		return counter;
	}

	//recursive method
	public static int recursiveCharCount(String str, int start, char ch) {
		//return zero if have already checked every character in string
		if(start>=str.length())
			return 0;
	
		//check if character a each index is equal to character looking for
		//if yes, return 1 for a match plus call the function itself again to recursively iterate
		if(str.charAt(start)==ch)
			return 1 + recursiveCharCount(str,start+=1,ch);
		else
			return recursiveCharCount(str,start+1,ch);
	}
		
		
}

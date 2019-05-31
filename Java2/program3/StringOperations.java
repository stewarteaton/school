/* Course: CSCI 112, Section 2 
 * Student Name: Stewart Eaton 
 * Student ID: 10510831  
 * Program 3 (Homework)
Due Date: October 2nd 2018
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.

Program Description:This program will ask the user to enter a sentence with no spaces and first letter of each word capitalized. 
Two methods are created and called. One method separates the string into words, and the other converts the words into pig latin.
*/

package program3;
import java.util.Scanner;

public class StringOperations {
	//Initialize variables
	public static String finalString="";
	public static String pigString="";
	public static int counter=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create canner and get input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence (all words together, capitalize 1st letter of each word): ");
		String original = sc.nextLine();
		sc.close();
		
		//make call to function that separates words passing user input 
		separateWords(original);
		System.out.print("Words Separated:"+finalString+"\n");
		//changes words to uppercase
		finalString = finalString.toUpperCase() + " ";
		System.out.print("To UpperCase:"+finalString); 
		
		//converts to pig latin
		toPigLatin(finalString);
		System.out.print("\nPig Latin: "+pigString);
		
		
	}

	
	public static String separateWords(String original) {
		//create char array to manipulate string
		char [] charArray = original.toCharArray();
		
		for (int i=0;i<charArray.length;i++) {
			//if character is upper case there will be a space added before that character is added to new string
			if(Character.isUpperCase(charArray[i])) 
				finalString = finalString + " " +Character.toString(charArray[i]);
			else 
				finalString = finalString + Character.toString(charArray[i]);;
		}
		return finalString;
	}
	
	public static String toPigLatin(String str) {
		char [] charArray = str.toCharArray();
		
		for (int i=1;i<charArray.length;i++) {
			//when looping through the character array, when space is found at end of word, the letters AY are added plus the letter at the beginning of the word
			if(charArray[i]==' ') {
				String work = str.substring(counter+2,i)+Character.toString(charArray[counter+1])+"AY" +" ";
				pigString = pigString + work;
				//user counter variable to keep track of where words begin. update it once new word created
				counter =i;
			}
		}
		return pigString;
	}
	
	
	

}

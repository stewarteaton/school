
package program5;
import java.util.Scanner;
/* Course: CSCI 112, Section 2 
 * Student Name: Stewart Eaton 
 * Student ID: 10510831  
 * Program 5 (Homework)
Due Date: October 29th 2018
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.

Program Description: This program requires user to input a secret message which is a message encoded by changing the ASCII representation of each character by an index of +10.
We convert and save the message as a binary file using FileOutPutStream and then retrieve and read the file before converting to reveal message.
*/

import java.io.*;
public class DecryptionMessage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create scanner to take user input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a secret message: ");
		String message = scan.nextLine();
		System.out.print("Enter the file name you want to write the message: ");
		String fileName = scan.nextLine();
		
		//Change input string to string array
		String[] inputCharacters = message.split("");
		
		//Creates file with name given by user
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		//writes message from user into file created
		for(int i=0;i<inputCharacters.length;i++) {
			outputFile.writeUTF(inputCharacters[i]);
		}
		System.out.println("Secret message has been written to the file.");
		
		//close output file
		outputFile.close();
		
		//ask user to input file name to read
		System.out.print("\nEnter the file name you want to read from: ");
		String readFile = scan.nextLine();
		
		//retrieves file to read from that user indicated
		FileInputStream fm = new FileInputStream(readFile);
		DataInputStream inputFile = new DataInputStream(fm);
		
		//instantiate boolean to create while loop
		boolean endOfFile = false;
		System.out.print("Decrypted Message: ");
		while(!endOfFile) {
			try {
				//Read message as a string from file
				String string = inputFile.readUTF();
				//convert string letter to charater so that it may be manipulated with ASCII standards
				char c = string.charAt(0);
				//Change index of character by 10
				c -=10;
	
				System.out.print(c);
			}
			catch(EOFException e) {
				endOfFile = true;
			}
		}
	}
	

}

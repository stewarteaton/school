package chap11;
import java.io.*;
import java.util.Scanner;

public class BasicFileIO {

	public static void main(String[] args) throws IOException {
		//append to a file
		FileWriter fw = new FileWriter("Names.txt");
		PrintWriter outputFile = new PrintWriter(fw);
		outputFile.println("Matthew");
		outputFile.println("Mark");
		outputFile.println("Luke");
		outputFile.close();
		
		//read from a file
		File file = new File("Names.txt");
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			String name = inputFile.nextLine();
			System.out.println(name);
		}
		inputFile.close();
		
	}

}

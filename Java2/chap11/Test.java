package chap11;
import java.io.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		String str= "abcde";
		try {
		int num = Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.print("Conversion error: "+e.getMessage());
		}
		//can use general word Exception" if there is only one exception and dont have to be specific
		catch(IllegalArgumentException e) {
			System.out.print("\nBad number format");
		}
		
		/*File file = new File("MyFile.txt");
		try {
			Scanner inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}*/
		
	}

}

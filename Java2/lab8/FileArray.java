package lab8;
import java.io.*;
import java.util.Scanner;

public class FileArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many integers are there in your array: ");
		int numberInts = scan.nextInt();
		System.out.print("\nEnter " +numberInts+" integers one by one: ");
		
		
		int[] array = new int[numberInts];
		for(int i=0; i<numberInts;i++) {
			array[i] = scan.nextInt();
		
		}
		System.out.print("Enter the file name to write the int array: ");
		Scanner scan1 = new Scanner(System.in);
		String fileName = scan1.nextLine();
		try {
			writeArray(fileName,array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("\nEnter the filename to read to the int array: ");
		String readFileName = scan1.nextLine();
		try {
			readArray(readFileName,array);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void writeArray(String fileName, int[] array) throws IOException {
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.print("\nWriting writing int array to the file...");
		for(int i=0; i<array.length;i++) {
			outputFile.writeInt(array[i]);
		}
		System.out.println("\nDone.");
		outputFile.close();
}
 
	public static void readArray(String fileName, int[] array) throws IOException{
		FileInputStream fm = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(fm);
		
		System.out.println("Reading int array from the file: ");
		boolean endOfFile = false;
		
		while(!endOfFile) {
			try {
				int num = inputFile.readInt();
				System.out.print(num+" ");
			}
			catch(EOFException e) {
				endOfFile = true;
			}
		}
		System.out.println("\nDone.");;
		inputFile.close();
	}
	
}

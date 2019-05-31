package chap11;
import java.io.*;

public class BinaryFileIO {
	
	public static void main(String[] args) throws IOException {
		char[] letters = {'a','b','c','d','e','f','g'};
		
		RandomAccessFile randomFile = new RandomAccessFile("Letters.dat","rw");
		
		System.out.println("Writing letters to the file...");
		
		for(int i=0; i<letters.length; i++) {
			randomFile.writeChar(letters[i]);
			
		}
	
		System.out.println("Done");
		randomFile.close();
		
		RandomAccessFile random = new RandomAccessFile("Letters.dat","r");
		final int CHAR_SIZE = 2;
		random.seek(CHAR_SIZE * 3);
		char ch = random.readChar();
		
		System.out.println(ch);
		
		random.close();
		
		/*
		String [] names = {"Matthew","Mark","Luke"};
		
		//int[] numbers = {2,4,6,8,10,12,14};
		//write int array to the file
		FileOutputStream fstream = new FileOutputStream("Names.dat");
		//FileOutputStream fstream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		System.out.println("Writing data to the file...");
		for(int i=0; i<names.length;i++) {
			outputFile.writeUTF(names[i]);
			
		}
		/*for(int i=0; i<numbers.length;i++) {
			outputFile.writeUTF(numbers[i]);
			outputFile.writeInt(numbers[i]);
		}*/
		/*System.out.println("Done");
		
		outputFile.close();
		
		//reads ints from file
		FileInputStream fm = new FileInputStream("Names.dat");
		DataInputStream inputFile = new DataInputStream(fm);
		
		System.out.println("Reading numbers from the file: ");
		boolean endOfFile = false;
		
		while(!endOfFile) {
			try {
				String num = inputFile.readUTF();
				System.out.println(num);
			}
			catch(EOFException e) {
				endOfFile = true;
			}
		}
		System.out.println("Done");;
		inputFile.close();*/
	}
}

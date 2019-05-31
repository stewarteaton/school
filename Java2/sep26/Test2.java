package sep26;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letters = 0, digits = 0, spaces =0, symbols = 0;

		System.out.print("Enter a sentence: ");;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char [] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			if(Character.isLetter(charArray[i]))
				letters++;
			else if(Character.isDigit(charArray[i]))
				digits++;
			else if(Character.isSpaceChar(charArray[i]))
				spaces++;
			else
				symbols++;
		}
		
		System.out.printf("There are %d letters, %d digits, %d spaces, and %d symbols in the sentence\n", letters,digits,spaces,symbols);
	}

}

package todayNow;

import java.util.Scanner;


public class getInput {
	
	public static void main(String[] args) {
		
	Scanner reader = new Scanner(System.in);	
	System.out.println("Enter number of rows for 2D array: ");
	int x = reader.nextInt();
	System.out.println("Enter number of columns for 2D array: ");
	int y = reader.nextInt();
	System.out.println("\nEnter integers for the "+x+" by "+y+" array: ");
	
	int allNumbers = reader.nextInt();
	String allValues=allNumbers+"";

	int counter = 0;
	int sum = 0;
	int [][] arrayList = new int [x][y];
	for(int i = 0; i <= x-1; i++) {
		for (int j = 0; j <= y-1; j++) {
			arrayList[i][j] = allValues.charAt(counter);
			counter++;
			sum = sum + arrayList[i][j];
		}
	}
	
	System.out.print("\nThe sum of the array is: "+sum);
	
	int avg = sum/(x*y);
	System.out.print("\nThe average of the array is: " + avg);
	
		
		
	for (int row=0; row < x; row++) {
		int rowT = 0;
		for (int col = 0; col< y; col++) {
			rowT += arrayList[row][col];
		}
		System.out.println("\nThe total for row "+row+" is "+rowT);
	}
	
	
	
	
	}
	
	
	
}

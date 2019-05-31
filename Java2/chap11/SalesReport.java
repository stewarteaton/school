package chap11;
import java.io.*;
import java.util.*;

public class SalesReport {

	//Must put save sales data to root directory
	
	public static void main(String[] args) {
		double totalSales=0;
		int months=0;
		
		try {
			File file = new File("SalesData.txt");
			Scanner inputFile = new Scanner(file);
			
			while(inputFile.hasNext()) {
				double oneMonth = inputFile.nextDouble();
				totalSales+=oneMonth;
				months++;
			}
			inputFile.close();
			System.out.printf("Total sales: %.2f\nAverage sales: %.2f\n", totalSales,totalSales/months);
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Non-numeric data is found in the file");
		}
	}

}

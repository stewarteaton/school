package lab9;

//this is a driver program

public class RainfallDemo{
	public static void main(String[] args){
	    
		//this array contains a negative number
		double[] badAmounts = {-4.9, 4.7, 5.0, 4.9, 4.3, 4.1, 4.8, 4.2, 3.0, 3.9, 4.7, 5.1};
		
		//this is good
		double[] goodAmounts = {4.9, 4.7, 5.0, 4.9, 4.3, 4.1, 4.8, 4.2, 3.0, 3.9, 4.7, 5.1};
	      
		//create a RainfallAmounts object initialized with badAmounts
		try{
			RainfallAmounts rBad = new RainfallAmounts(badAmounts);

			//the following statement should not execute.
			System.out.println("\nThe average of the bad amounts is " + String.format("%.2f", rBad.getAverage()));
		}
		catch (InvalidRainfallAmounts e){
			System.out.println("\nInvalid data found.\n" + e.getMessage());
		}
	   			
		//create a RainfallAmounts object initialized with goodAmounts
		try{
			RainfallAmounts rGood = new RainfallAmounts(goodAmounts);
			System.out.println("\nThe average of the good amounts is " + String.format("%.2f", rGood.getAverage()));
		}
		catch (InvalidRainfallAmounts e){
			System.out.println("\nInvalid data found.\n" + e.getMessage());
		}
	}
}

package lab4;
import java.util.Scanner;


public class LandGrassDemo {
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of your tract in footage: ");
		double length = sc.nextDouble();
		System.out.print("Enter width of your tract in footage: ");
		double width = sc.nextDouble();
		System.out.print("Enter price per pallet: ");
		double price = sc.nextDouble();
		sc.close();
		
		Tract thisTract = new Tract(length,width);
		LandGrass thisLandGrass = new LandGrass(thisTract,price);
		
		System.out.printf("\nLand dimensions: %.1f feet by %.1f feet", length,width);
		System.out.printf("\nNumber of pallets needed: %.0f", thisLandGrass.getNumPallets());
		System.out.printf("\nTotal Cost: $%.2f",thisLandGrass.getCosts());
	}

	
	


}

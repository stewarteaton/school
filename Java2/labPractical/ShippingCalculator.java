package labPractical;
import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the weight of the item (lbs): ");
		double weight = scan.nextDouble();
		
		System.out.print("\n\nOur shipping options are: ");
		System.out.print("\n\t1. Flat rate: 6-8 business days");
		System.out.print("\n\t2. Standard shipping: 3-5 days");
		System.out.print("\n\t3. Express shipping: 1-2 business days");
		
		System.out.print("\n\nEnter your shipping option (1-3): ");
		double option = scan.nextDouble();
		scan.close();
		ShippingCost cost = null;
		
		if(option==1) {
			cost = new FlatRateShipping();
			//FlatRateShipping fR = new FlatRateShipping();
			System.out.print("\nYour choice:\t"+cost.getLabel());
			System.out.print("\nShipping Cost: \t"+cost.getShippingCost(weight));
					
		}
		else if(option==2) {
			cost = new StandardShipping();
			//StandardShipping sR = new StandardShipping();
			System.out.print("\nYour choice:\t"+cost.getLabel());
			System.out.print("\nShipping Cost: \t"+cost.getShippingCost(weight));
		}
		else if(option==3) {
			cost = new ExpressShipping();
			//ExpressShipping eR = new ExpressShipping();
			System.out.print("\nYour choice:\t"+cost.getLabel());
			System.out.print("\nShipping Cost: \t"+cost.getShippingCost(weight));
		}
		else {
			System.out.print("\nInvalid choice");
		}
	}

}

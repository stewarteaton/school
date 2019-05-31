package Lab3;
import java.util.Scanner;

//This is a driver program, you need to add two lines of code to make the program run 
//if you have successfully finished your other two classes.

public class CarTaxDemo {

	public static void main(String[] args) {
		
		//ask for year model, make, and price of the car
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter year model: ");
		String ym = scan.nextLine();
		System.out.print("Enter make: ");
		String mk = scan.nextLine();
		System.out.print("Enter car price: ");
		double price = scan.nextDouble();
		
		//create a Car object
		//WRITE a line of code here ......
		Car myCar = new Car(ym,mk,price);
		//Car carDemo = new Car(ym, mk, price);
		
		//ask for state tax rate
		System.out.print("Enter state tax rate (i.e. enter 15 for 15%): ");
		double rate = scan.nextDouble();
		
		//create a CarTax object
		//WRITE a line of code here ......pay attention to the system.out.println below ... what did I put in there?
		CarTax carTax = new CarTax(myCar,rate);
		
		//display output
		System.out.println(carTax);
		
	}

}
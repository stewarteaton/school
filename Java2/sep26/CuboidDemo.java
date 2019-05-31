package sep26;
import java.util.Scanner;

public class CuboidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length: ");
		double l = scan.nextDouble();
		System.out.print("Enter width: ");
		double w = scan.nextDouble();
		System.out.print("Enter height: ");
		double h = scan.nextDouble();
		
		Cuboid myCuboid = new Cuboid(l,w,h);
		System.out.print(myCuboid);
	}

}

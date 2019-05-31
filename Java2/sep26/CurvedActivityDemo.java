package sep26;
import java.util.Scanner;
public class CurvedActivityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a raw score: ");
		double raw = scan.nextDouble();
		System.out.print("Enter curve percentage: ");
		double percent = scan.nextDouble();
		
		CurvedActivity curved = new CurvedActivity(percent);
		curved.setScore(raw);
		
		System.out.print(curved);
	}

}

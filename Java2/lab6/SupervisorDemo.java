package lab6;
import java.util.Scanner;

public class SupervisorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		System.out.print("Enter employee number: ");
		String number = sc.nextLine();
		System.out.print("Enter hire date: ");
		String date = sc.nextLine();
		System.out.print("Enter annual salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter annual bonus: ");
		double bonus = sc.nextDouble();
		sc.close();
		
		//create object
		ShiftSupervisor list = new ShiftSupervisor(name,number,date,salary,bonus);
		
		System.out.println("\nHere's the shift supervisor info: ");
		System.out.println(list);
		
	}

}

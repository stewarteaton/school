package sep26;

import java.util.Scanner;

public class FinalExam2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of questions on the exam: ");
		int num = scan.nextInt();
		System.out.print("Enter number of questions missed: ");
		int missed = scan.nextInt();
		
		FinalExam2 exam2 = new FinalExam2(num,missed);
		System.out.print(exam2);
	
	}

}

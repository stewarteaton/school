package sep26;
import java.util.Scanner;

public class FinalExamDemo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of questions on the exam: ");
		int num = scan.nextInt();
		System.out.print("Enter number of questions missed: ");
		int missed = scan.nextInt();
		
		FinalExam exam = new FinalExam(num,missed);
		System.out.printf("The score is %.2f and the ltter grade is %c\n",exam.getScore(),exam.getGrade());
	}
}

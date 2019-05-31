package sep26;
import java.util.Scanner;

public class PassFailExamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of question: ");
		int num = scan.nextInt();
		System.out.print("Enter number of questions missed ");
		int missed = scan.nextInt();
		
		System.out.print("Enter minimum passing score: ");
		double minScore = scan.nextDouble();
		
		PassFailExam exam = new PassFailExam(num,missed,minScore);
		System.out.printf("Score is: %.1f and letter grade is %c\n",exam.getScore(),exam.getGrade());
	}

}

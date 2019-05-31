package sep26;
import java.util.Scanner;

public class GradedActivityDemo {

	public static void main(String[] args) {
		
		GradedActivity activity = new GradedActivity();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a score: ");
		double s = scan.nextDouble();
		activity.setScore(s);
		
		System.out.printf("The score is %.2f and the letter grade is %c\n",activity.getScore(),activity.getGrade());
	}

}

package sep26;

public class Polymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradedActivity[] tests = new GradedActivity[3];
		
		tests[0] = new GradedActivity();
		tests[0].setScore(95);
		tests[1] = new FinalExam(80,10);
		tests[2] = new PassFailExam(80,10,70);
		
		//display scores and letter grades
		for(int i=0; i<tests.length; i++) {
			System.out.printf("Test %d: score %.1f and letter grade %c\n", (i+1),tests[i].getScore(),tests[i].getGrade());
		}
	}

}

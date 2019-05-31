package sep26;

public class FinalExam2 extends GradedActivity2{
	private int numQuestions;
	private int numMissed;
	
	public FinalExam2(int questions, int missed) {
		numQuestions = questions;
		numMissed = missed;
		
		double pointsEachQuestion = 100.0/questions;
		double numericScore = 100 - pointsEachQuestion*missed;
		setScore(numericScore);
		System.out.printf("The original score is %.1f\n", score);
		//add method
		adjustScore();
		System.out.printf("The adjusted score is %.1f\n", score);
	}
//Used source - generate getters and setters 
	public int getNumQuestions() {
		return numQuestions;
	}

	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}

	public int getNumMissed() {
		return numMissed;
	}

	public void setNumMissed(int numMissed) {
		this.numMissed = numMissed;
	}
	
	private void adjustScore() {
		double fraction = score - (int)score;
		if(fraction >=.5)
			score = score + (1-fraction);
	}
	
	public String toString() {
		String str="\nThe letter grade is " + getGrade();
		return str;
	}
}

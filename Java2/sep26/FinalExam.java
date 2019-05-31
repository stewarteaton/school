package sep26;

public class FinalExam extends GradedActivity {
	private int numQuestions;
	private int numMissed;
	
	public FinalExam(int questions, int missed) {
		numQuestions = questions;
		numMissed = missed;
		
		double pointsEachQuestion = 100.0/questions;
		double numericScore = 100 - pointsEachQuestion*missed;
		setScore(numericScore);
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
	
	
}

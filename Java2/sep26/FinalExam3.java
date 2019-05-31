package sep26;

public class FinalExam3 extends GradedActivity implements Relatable{
	private int numQuestions;
	private int numMissed;
	
	public FinalExam3(int questions, int missed) {
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
	
	public boolean equals(GradedActivity g) {
		if(this.getScore()>g.getScore()) {
			return true;}
			else {
				return false;
		}
	
	}
	
	public boolean isLess(GradedActivity g) {
		if(this.getScore()<g.getScore()) {
			return true;}
		else {
			return false;
		}
	}
	public boolean isGreater(GradedActivity g) {
		if(this.getScore()>g.getScore()) {
			return true;}
		else {
			return false;
		}
	}
	
}

package sep26;

public class PassFailExam extends PassFailActivity{
	private int numQuestions;
	private int numMissed;
	private double minPassingScore;
	
	//Test this program through object method class that we didnt create
	public PassFailExam(int questions ,int missed,double mps) {
		super(mps);
		numQuestions = questions;
		numMissed = missed;
		double pointsEachQuestion = 100.0 / questions;
		setScore(100 -missed*pointsEachQuestion);
		}
	
	//getters and setters
	
	//toString
	public String toString() {
	String str = String.format("Score is %.1f and letter grade is %c\n",getScore(),getGrade());
	return str;
	}
	
	//equals method
	public boolean equals(PassFailExam object2) {
		if(numQuestions == object2.numQuestions && numMissed==object2.numMissed && minPassingScore ==object2.minPassingScore) {
			return true;}
		else {
			return false;
		}
	}
	
	//copy method
	public PassFailExam copy() {
		return new PassFailExam(numQuestions,numMissed,minPassingScore);
	}
}

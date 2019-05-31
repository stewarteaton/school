package sep26;

public class PassFailActivity extends GradedActivity{
	private double minPassingScore;
	
	public PassFailActivity(double mps) {
		minPassingScore = mps;
	}
	
	@Override
	public char getGrade() {
		if(super.getScore() >= minPassingScore) 
			return 'P';
		else
			return 'F';
		
	}
}

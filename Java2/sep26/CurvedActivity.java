package sep26;

public class CurvedActivity extends GradedActivity {
	private double rawScore;
	private double percentage;
	
	public CurvedActivity(double percent) {
		percentage = percent;
	}
	
	@Override
	public void setScore(double r) {
		rawScore = r;
		super.setScore(r * percentage);
	}
	
	//getters and setters here
	
	//toString method
	public String toString() {
		String str = String.format("The raw score is %.1f, the curved score is %.1f, the curved letter grade is %c\n",rawScore,getScore(),getGrade());
		return str;
	}
}

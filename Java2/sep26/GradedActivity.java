package sep26;

public class GradedActivity {
	private double score;
	
	public void setScore(double s) {
		score = s;
	}
	
	public double getScore() {
		return score;
	}
	
	public char getGrade() {
		if(score>=90 && score <=90)
			return 'A';
		else if (score>=80)
			return 'B';
		else if (score>=70)
			return 'C';
		else if (score>=60)
			return 'D';
		else
			return 'F';
	}
}

package sep26;

public class CSStudent extends Student{
	//required hours
	private final int MATH_HOURS = 20;
	private final int CS_HOURS = 40;
	private final int GEN_ED_HOURS = 60;
	
	//hours taken
	private int mathHours;
	private int csHours;
	private int genEdHours;
	
	public CSStudent(String name, String id, int year) {
		super(name, id, year);
	
	}


	
	public int getMathHours() {
		return mathHours;
	}



	public void setMathHours(int mathHours) {
		this.mathHours = mathHours;
	}



	public int getCsHours() {
		return csHours;
	}



	public void setCsHours(int csHours) {
		this.csHours = csHours;
	}



	public int getGenEdHours() {
		return genEdHours;
	}



	public void setGenEdHours(int genEdHours) {
		this.genEdHours = genEdHours;
	}



	public int getMATH_HOURS() {
		return MATH_HOURS;
	}



	public int getCS_HOURS() {
		return CS_HOURS;
	}



	public int getGEN_ED_HOURS() {
		return GEN_ED_HOURS;
	}



	@Override
	public String toString() {
		String str = super.toString();
		str += "\nMajor: CS" + "\nMath HOurs: + " + mathHours + "\nCS Hours " + csHours + "\nGen Ed Hours: " + genEdHours;
		return str;
	}
	
	@Override 
	public int getRemainingHours() {
		return (MATH_HOURS + CS_HOURS + GEN_ED_HOURS) - (mathHours + csHours + genEdHours);
	}
};

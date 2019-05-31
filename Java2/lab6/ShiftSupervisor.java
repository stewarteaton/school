package lab6;

public class ShiftSupervisor extends Employee{
	//instance fields
	private double annualSalary;
	private double annualBonus;
	
	public ShiftSupervisor(String n,String num,String date,double salary,double bonus) {
		super(n,num,date);
		annualSalary = salary;
		annualBonus = bonus;
	}
	
	//generate setters and getters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getAnnualBonus() {
		return annualBonus;
	}

	public void setAnnualBonus(double annualBonus) {
		this.annualBonus = annualBonus;
	}
	public double getTotalPay(double salary, double bonus) {
		return salary + bonus;
	}
	
	//toString method
	public String toString() {
		String str = super.toString();
		str += String.format("Annual salary: $%.2f\nAnnual bonus: $%.2f\nTotal Pay: $%.2f",annualSalary,annualBonus,getTotalPay(annualSalary,annualBonus));
		return str;
	}
	
}

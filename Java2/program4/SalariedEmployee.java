package program4;

public class SalariedEmployee extends Employee{
	private double annualSalary;

	//constructor, used super to extend employee class
	public SalariedEmployee(String n, Date d,double salary) {
		super(n,d);
		annualSalary = salary;
	}
	
	//setters and getters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//function to find monthly pay
	public double getMonthlyPay() {
		return annualSalary/12;
	}
	
	//toString method
	public String toString() {
		String str = String.format("Employee Name: %s\nHire Date: %s\n\nSalaried Employee\nAnnual salary: $%.2f\nMonthly pay: $%.2f",getName(),getHireDate(),getAnnualSalary(),getMonthlyPay());
		return str;
	}
}

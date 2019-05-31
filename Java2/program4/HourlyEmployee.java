package program4;

public class HourlyEmployee extends Employee{
	//instance fields
	private double hourlyRate;
	private double hoursWorkedMonthly;
	
	//constructor, user super to extend Employee class
	public HourlyEmployee(String n, Date d, double rate, double hours) {
		super(n,d);
		hourlyRate = rate;
		hoursWorkedMonthly = hours;
	}

	//setters and getters
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorkedMonthly() {
		return hoursWorkedMonthly;
	}

	public void setHoursWorkedMonthly(double hoursWorkedMonthly) {
		this.hoursWorkedMonthly = hoursWorkedMonthly;
	}
	
	public double getMonthlyPay() {
		return hourlyRate*hoursWorkedMonthly;
	}
	
	//toString method
	public String toString() {
		String str =String.format("Employee Name: %s\nHire Date: %s\n\nHourly Employee\nHourly Rate: $%.2f\nHours Worked: %.2f\nTotal Pay: $%.2f",getName(),getHireDate(),getHourlyRate(),getHoursWorkedMonthly(),getMonthlyPay());	
		return str;
	}
}

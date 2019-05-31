package lab6;

public class Employee {
	//instance fields
	private String name;
	private String employeeNumber;
	private String hireDate;
	
	//constructor
	public Employee(String n, String num,String date) {
		name = n;
		employeeNumber = num;
		hireDate = date;
	}

	//generated setters and getters
	public String getEmployeeName() {
		return name;
	}

	public void setEmployeeName(String employeeName) {
		this.name = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	//toString method
	public String toString() {
		String str = String.format("\nEmployee name: %s\nEmployee number: %s\nHire Date: %s\n\n",name,employeeNumber,hireDate);
		return str;
	}
}

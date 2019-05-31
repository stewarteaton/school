package program4;

public class Employee{
	//instance fields
	private String name;
	private Date hireDate;
	
	//constructor1
	public Employee(String n, Date d) {
		name = n;
		hireDate = d;
	}
	//constructor2
	public Employee(Employee object2) {
		name = object2.name;
		hireDate = object2.hireDate;
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	//toString method
	public String toString() {
		String str="Employee Name: "+getName()+"\nHire Date: "+getHireDate();
		return str;
	}
}

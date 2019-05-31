package program4;

/* Course: CSCI 112, Section 2 
 * Student Name: Stewart Eaton 
 * Student ID: 10510831  
 * Program 4 (Homework)
Due Date: October 16nd 2018
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor.

Program Description: This program requires that an Employee class is created which accepts an employees name and hire date with two different constructors.Then two other classes are created that extend the
employee class. In the driver program three employee objects are created by a new hourlyEmployee or salariedEmployeed object. A loop is used to print each of these objects.
*/

public class EmployeeDemo {
	
	public static void main(String[] args) {
		final int NUM_EMPLOYEES = 3;
		Employee[] employees = new Employee[NUM_EMPLOYEES];
	      
	    //assign Employee objects to the array elements
	    employees[0] = new HourlyEmployee("John Davis", new Date(9, 1, 2018), 10.50, 80);
	    employees[1] = new HourlyEmployee("Mary Smith", new Date(1, 31, 2015), 15.50, 140);
	    employees[2] = new SalariedEmployee("Catherine Locke", new Date(5, 1, 2017), 50000);
	      
	    // Call each object's toString method.
	    for (int i = 0; i < 3; i++){
	       System.out.println(employees[i]);
	       System.out.println("----------------------------");
	    }
	}
}
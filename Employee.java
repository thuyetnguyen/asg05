package asg05;

import java.util.Date;


public class Employee extends Person {
protected double salary;

	public Employee( String n, Date d, double s) 
	{
		super(n, d);
		salary = s;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		
		return ( "Employee: \n\tName: " + getName() + "\tBirthday: "
								+ birthday.toString() + "\tSalary: " + getSalary() );
	}


}

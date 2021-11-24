package testpackage;

public class Employee {
	int empId;   // instance variables of a class.
	String empName;
	static String empCmpny = "SPCompany";
	//static variable declared whose values stays same so each object of the class can get the same value.
	Employee(int empId, String empName) // Employee class constructor used to initialize values when object is created.
	
	{
		this.empId = empId;  // this is used to assign the value of empId to the instance variable of the class.
		this.empName = empName;	
		
	}
	void display()
	{
		
		System.out.println( empId + "  " +  empName + "  " + empCmpny);
	}
	public static void main (String[] args)
	{
	  Employee e1 = new Employee(13456, "Deepak");
	  Employee e2 = new Employee(345689, "ArjunReddy");
	  Employee e3 = new Employee(45678, "Sreedhar");
	  e1.display();
	  e2.display();
	  e3.display();
	 
   }
}
	

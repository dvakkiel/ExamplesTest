package serialization.deserialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	int rollNo;
	String name;
	String department;
	static String collegeName = "Kumaraguru College of Arts and Science";
	
	Student(int rollNo, String name, String department, String collegeName)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
		this.collegeName = collegeName;
		
	}

}

package serialization.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoTest {
	public static void main(String args[]) throws IOException
	{
		Student s1 = new Student (123, "Haneefa", "CSE");
		Student s2 = new Student (125, "Karthikeyen", "ICT");
		//Object of Student class is serialized using writeObject() method and written to student.txt file.
		
		try {
			FileOutputStream fos;
			fos = new FileOutputStream("student.txt");		
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(s1);
		    oos.writeObject(s1);
		    oos.flush();
		    oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	// Now the ObjectInputStream will read the object from the stream specified in student.txt file	
		Student stu = null;
		try
		{
			FileInputStream fis;
			fis = new FileInputStream("/filepath/student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			stu = (Student)ois.readObject();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s1.department);
		System.out.println(s1.collegeName); // will give null as static members/fields are not serialized (They belong to class than object of a class)
		System.out.println(Student.collegeName);
		
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		System.out.println(s2.department);
		System.out.println(s2.collegeName);
		System.out.println(Student.collegeName);
		
		// if a field/member variable is declared transient then it is also not serialized.
	}

}

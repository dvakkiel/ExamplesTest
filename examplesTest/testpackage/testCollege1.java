package testpackage;

public class testCollege1 {
	/* Example for Static Method */

	 int i;
	 static String name1 = "EEC";
	 static void update()
	 {
		 name1 = "EEE";
	 }
	void display(){
		
		System.out.println("The value of name is  : " + name1);
		
	}

	public static void main (String [] args)
	{
		 
	    update(); /* as it static method no object needed to call it */
		testCollege1 e1= new testCollege1();
		e1.display();
		
	}
}

	
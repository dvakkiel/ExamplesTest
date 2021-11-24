package dynamicpolymorphismConcept;

public class TestCarClass {

	public static void main(String[] args) {
		MaruthiChildClass mc = new MaruthiChildClass();
		mc.drive();
		mc.start();
		
		 CarParentClass cp =  new MaruthiChildClass(); 
		 cp.drive();   // Method overriding or dynamic polymorphism where the parent class method is overriden at runtime.
		 cp.start();
      
		 
		 CarParentClass cp1 =  new CarParentClass();
		 cp1.drive();
		 cp1.start();
	}

}

/*The drive method of a Maruthi class here
  The start method of a Maruthi class here
  
  The drive method of a Maruthi class here
  The start method of a Maruthi class here
  
  The drive method of a parent class here
  The start method of a parent class here
*/
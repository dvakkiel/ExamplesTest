package dynamicpolymorphismConcept;

public class SingletonClass {
	
	private static SingletonClass singleton;
	
    private SingletonClass() {
    	
    	// using private constructor -  hinder other classes to create an object of this class.
    	// used when create a database object/ driver object.
    }
    
    public static SingletonClass getInstance() {
    
    	 if (singleton == null)
    	 {
    		 singleton = new SingletonClass();
    	 }
    
        return singleton;
}
}
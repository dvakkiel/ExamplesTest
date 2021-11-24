package dynamicpolymorphismConcept;

public class TestSingleton {

	public static void main(String[] args) {
		
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		
		
		// both s1 and s2 get the same instance even though 2 different objects are created.
	}

}

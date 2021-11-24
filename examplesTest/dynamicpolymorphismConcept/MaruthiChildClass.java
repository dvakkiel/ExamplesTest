package dynamicpolymorphismConcept;

public class MaruthiChildClass extends CarParentClass {
	@Override
	public void drive()
	{
		System.out.println("The drive method of a Maruthi class here");
	}
	@Override
	public void start()
	{
		System.out.println("The start method of a Maruthi class here");
	}

}

//  @OVERRIDE : It indicates that the child class method is over-writing its base class method.
package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		b.drive();
		b.reverse();
		b.start();
		
	Car c = new BMW();
    c.drive();
    c.start();
    Car.reverse(); 
    Car.wheels();
	

	}

}

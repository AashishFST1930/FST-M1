package Activities;

public class Car {

	// Properties

	String color;
	String transmission;
	int make;
	int tyres = 4;
	int door = 4;

	// Constructor
	public Car(String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
	}

	// Method
	public void displayCharacterstics() {
		// Print the value of this class

		System.out.println("The color is : " + color);
		System.out.println("The transmission type is : " + transmission);
		System.out.println("This is car was made in : " + make);
		System.out.println("It Has : " + door);
		System.out.println("It Has : " + tyres);

	}
	
	public void accelerate() {
		System.out.println("This car moving forward");
	}
	
	public void brake() {
		System.out.println("This car has stopped");
	}
	
}

package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create object of clas
		Car honda = new Car("Black", "Automatic", 2020);

		// print the details of the car
		honda.displayCharacterstics();
		// move the car
		honda.accelerate();
		// stop the car
		honda.brake();
	}

}

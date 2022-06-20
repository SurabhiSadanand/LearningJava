package classPrograms;

public class LaptopMain {

	public static void main(String[] args) {

		// step 1:initializing class variables with object1-hp
		Laptop hp = new Laptop();
		hp.laptopName = "hp";
		hp.ramSize = 16.0;
		hp.processorType = "ios";
		hp.print();

		// object2-acer object to invoke method to initialize class variables
		Laptop acer = new Laptop();
		acer.initializeVariables();

		// object3-dell used to invoke parameterized constructor of class Laptop
		Laptop dell = new Laptop("Dell", 8, "Intel-NSeries");
		dell.print();
	}

}

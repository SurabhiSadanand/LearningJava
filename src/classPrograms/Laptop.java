package classPrograms;

public class Laptop {

	String laptopName;
	double ramSize;
	String processorType;

	void print() {
		System.out.println("Laptop name: " + laptopName);
		System.out.println("Ram Size: " + ramSize + "GB");
		System.out.println("Processor Type: " + processorType);
	}

	// using method to initialize class variables.
	void initializeVariables() {
		laptopName = "Acer";
		ramSize = 32.0;
		processorType = "Intel Core";
		print();
	}

	// using parameterized constructor
	Laptop(String lapName, double ram, String processor) {
		laptopName = lapName;
		ramSize = ram;
		processorType = processor;

	}

	Laptop() {

	}
}

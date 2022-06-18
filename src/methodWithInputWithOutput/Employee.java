package methodWithInputWithOutput;

public class Employee {

	String firstName;
	String lastName;
	int hourlyRate;

	// Using a class method which takes input and returns output
	int salary(int hoursWorked) {

		return hourlyRate * hoursWorked;
	}

}

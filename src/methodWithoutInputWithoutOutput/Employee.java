package methodWithoutInputWithoutOutput;

public class Employee {

	String firstName;
	String lastName;
	int hourlyRate;
	int noOfHours;

	// Using a class method which doesnot takes input and doesnot returns output
	void salary(int hoursWorked) {

		System.out.println("Weekly salary:$" + (hourlyRate * hoursWorked));
	}
}

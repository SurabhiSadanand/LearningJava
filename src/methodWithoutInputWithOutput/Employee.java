package methodWithoutInputWithOutput;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	int hourlyRate;
	int noOfHours;

	// using a method which does not take input but returns output.
	int salary() {

		int weeklySalary = noOfHours * hourlyRate;
		return weeklySalary;
	}
}

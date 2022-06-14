package classMethodAssignment;

import java.util.Scanner;

public class Employee {

	String firstName;
	String lastName;
	int hourlyRate;
	
	void printEmployeeDetails()
	{
		System.out.println("Employee First Name: "+firstName);
		System.out.println("Employee Last Name: "+lastName);
		System.out.println("Employee Hourly Rate: "+hourlyRate);
	}
	int weeklyRate()
	{
		System.out.println("Enter no. of hours worked:");
		Scanner sc= new Scanner(System.in);
		int hours=sc.nextInt();
		return hours*hourlyRate;
			
	}
	
}

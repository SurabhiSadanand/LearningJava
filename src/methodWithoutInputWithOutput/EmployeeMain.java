package methodWithoutInputWithOutput;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name");
		emp.firstName = sc.next();
		System.out.println("Enter the last Name");
		emp.lastName = sc.next();
		System.out.println("Enter the hourly salary");
		emp.hourlyRate = sc.nextInt();
		System.out.println("Enter the no. of hours");
		emp.noOfHours = sc.nextInt();
		System.out.println("***EMPLOYEE DETAILS***");
		System.out.println("First Name: " + emp.firstName);
		System.out.println("Last Name: " + emp.lastName);
		System.out.println("Hourly Rate: " + emp.hourlyRate);
		System.out.println("No. of Hours: " + emp.noOfHours);
		int weeklySalary = emp.salary();
		System.out.println("Weekly Salary: " + weeklySalary);
		sc.close();

	}

}

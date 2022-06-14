package classMethodAssignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		int weeklyRateCalculated;
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name of employee: ");
		emp.firstName = sc.next();
		System.out.println("Enter the last name of employee: ");
		emp.lastName = sc.next();
		System.out.println("Enter the hourly rate of employee: $");
		emp.hourlyRate = sc.nextInt();
		System.out.println("***EMPLOYEE DETAILS***");
		emp.printEmployeeDetails();
		weeklyRateCalculated = emp.weeklyRate();
		System.out.println("Weekly rate of employee calculated: $" + weeklyRateCalculated);
		sc.close();

	}

}

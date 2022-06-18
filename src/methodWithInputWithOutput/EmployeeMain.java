package methodWithInputWithOutput;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name");
		emp.firstName = sc.next();
		System.out.println("Enter the second Name");
		emp.lastName = sc.next();
		System.out.println("Enter the hourly rate");
		emp.hourlyRate = sc.nextInt();
		System.out.println("*****EMPLOYEE DETAILS*****");
		System.out.println("First name =" + emp.firstName);
		System.out.println("Second Name =" + emp.lastName);
		System.out.println("Hourly Rate =" + emp.hourlyRate);
		System.out.println("Enter the no. of hours worked");
		int noOfHours = sc.nextInt();
		int weeklySalary = emp.salary(noOfHours);
		System.out.println("Weekly Salary:$" + weeklySalary);
		sc.close();

	}

}

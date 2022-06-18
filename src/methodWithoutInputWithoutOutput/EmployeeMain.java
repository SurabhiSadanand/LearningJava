package methodWithoutInputWithoutOutput;

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
		emp.salary(emp.noOfHours);
        sc.close();

	}

}

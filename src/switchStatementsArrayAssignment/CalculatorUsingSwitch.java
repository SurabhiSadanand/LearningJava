package switchStatementsArrayAssignment;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		double num1;
		double num2;
		double result;
		int choice;
		String ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*********Calculator Operations***********");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter 1st number:");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number:");
				num2 = sc.nextInt();
				result = num1 + num2;
				System.out.println("Result of Addition: " + result);
				break;

			case 2:
				System.out.println("Enter 1st number:");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number:");
				num2 = sc.nextInt();
				result = num1 - num2;
				System.out.println("Result of Subtraction: " + result);
				break;

			case 3:
				System.out.println("Enter 1st number:");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number:");
				num2 = sc.nextInt();
				result = num1 * num2;
				System.out.println("Result of Multiplication: " + result);
				break;

			case 4:
				System.out.println("Enter 1st number:");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number:");
				num2 = sc.nextInt();
				result = num1 / num2;
				System.out.println("Result of Division: " + result);
				break;

			default:
				System.out.println("Not a valid operation!!!");
			}
			System.out.println("Do you want to continue: (y/n)");
			ch = sc.next();
		} while (ch.equals("Y") || ch.equals("y"));

	}

}

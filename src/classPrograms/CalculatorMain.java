package classPrograms;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		double result;
		String ch;
		do {
			System.out.println("*****CALCULATOR******");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("Select one operation:");
			int choice = sc.nextInt();
			System.out.println("Enter 1st number");
			int num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
			int num2 = sc.nextInt();
			switch (choice) {
			case 1:
				result = calc.addition(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				result = calc.subtraction(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 3:
				result = calc.multiplication(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 4:
				result = calc.division(num1, num2);
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Enter one of the valid operation number from the menu!!!");
				break;
			}
			System.out.println("Do you want to continue:(Y/N):");
			ch = sc.next();
		} while (ch.equals("Y") || ch.equals("y"));
		sc.close();
	}

}

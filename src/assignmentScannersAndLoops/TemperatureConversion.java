package assignmentScannersAndLoops;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {

		/*
		 * Read user input for temperature in Celsius or Fahrenheit if temperature is in
		 * Celsius convert it to Fahrenheit by (C × 9/5) + 32 if temperature is in
		 * Fahrenheit convert it to Celsius by (F − 32) × 5/9
		 */
		int choice;
		double C = 0;
		double F = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		System.out.println("1.Celsius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celsius");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter temperature in Celsius: ");
			C = sc.nextDouble();
			F = (C * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit: " + F);

		}
		if (choice == 2) {
			System.out.println("Enter temperature in Fahrenheit: ");
			F = sc.nextDouble();
			C = ((F - 32) * 5 / 9);
			System.out.println("Temperature in Celsius: " + C);

		} else {
			System.out.println("Invalid input!!!!");

		}
		sc.close();

	}

}

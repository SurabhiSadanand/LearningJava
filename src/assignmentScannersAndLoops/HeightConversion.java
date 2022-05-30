package assignmentScannersAndLoops;

import java.util.Scanner;

public class HeightConversion {

	public static void main(String[] args) {

		/*
		 * To convert height and inches to centimeters height is taken as input in two
		 * parts- in feet and then inches part for the height the calculation for height
		 * is done by 30.48 * feet + 2.54 * inches centimeters. and print as the output
		 */

		double feet = 0; // initialized variable feet to 0 before reading dynamic input from user
		double inches = 0; // initialized variable inches to 0 before reading dynamic input from user
		double heightInCentimeters = 0; // variable to save calculated the height in centimeters

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height in feet: ");
		feet = sc.nextDouble(); // read user input for height in feet

		System.out.println("Enter the height in inches: ");
		inches = sc.nextDouble(); // read user input for part of height in inches

		heightInCentimeters = 30.48 * feet + 2.54 * inches; // calculation for height in centimeters

		System.out.println("The height in Centimeters is: " + heightInCentimeters); // output the height in centimeters
		sc.close();
	}

}

package classMethodAssignment;

import java.util.Scanner;

public class AmusementParkRide {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ch;
		do {
			Person Bob = new Person();
			System.out.println("Enter height of person:");
			// double height= sc.nextDouble();
			Bob.height = sc.nextDouble();
			System.out.println("Enter weight of person:");
			Bob.weight = sc.nextDouble();
			boolean isAbleToRide = Bob.isEligibleToRide();
			if (isAbleToRide == true) {
				System.out.println("***Person allowed to board rides in Amusement Park, Enjoy***");
			} else {
				System.out.println("***Sorry, person not allowed to board rides in Amusement Park***");
			}
			System.out.println("Do you want to continue: (y/n)");
			ch = sc.next();

		} while (ch.equals("Y") || ch.equals("y"));
		sc.close();
	}

}

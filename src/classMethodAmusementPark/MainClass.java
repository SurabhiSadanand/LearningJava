package classMethodAmusementPark;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		AmusementPark slide = new AmusementPark();
		boolean isEligibleToRide = false;
		Scanner sc = new Scanner(System.in);
		Person surabhi = new Person();
		System.out.println("Enter person's height:");
		surabhi.height = sc.nextInt();
		System.out.println("Enter person's weight:");
		surabhi.weight = sc.nextInt();

		isEligibleToRide = slide.isEligibleToRide(surabhi.height, surabhi.weight);
		if (isEligibleToRide) {
			System.out.println("Eligible to ride");
		} else {
			System.out.println("Not eligible to ride");
		}
	     surabhi.postToInsta(slide.parkName);
	}

}

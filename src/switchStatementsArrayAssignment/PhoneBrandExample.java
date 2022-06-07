package switchStatementsArrayAssignment;

import java.util.Scanner;

public class PhoneBrandExample {

	public static void main(String[] args) {
		/*
		 * For a given phone brand name, show all the available products present in that
		 * category. After displaying all the available products, ask user to enter one
		 * product name. Ensure user enters one of the displayed names. If user enters a
		 * name which is present in list, print “product selected is : name of product “
		 * otherwise display an error message – “Please select a product from the list”*
		 * 
		 */
		int phoneBrand;
		String productName;
		boolean productFound = false;
		Scanner sc = new Scanner(System.in);

		// display list of phone brand names for user to select from
		System.out.println("**********PHONE BRANDS*********");
		System.out.println("1.Samsung");
		System.out.println("2.Google");
		System.out.println("3.Apple");
		System.out.println("Enter the phone brand: ");
		phoneBrand = sc.nextInt();

		// array created and initialized to store the available products for each phone
		// brand
		String Samsung[] = { "S20", "S21", "Flip3", "Fold3" };
		String Google[] = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String Apple[] = { "Iphone12", "Iphone12 mini", "Iphone 11", "Iphone11" };

		// switch-case to display products and to select corresponding product
		switch (phoneBrand) {
		case 1: {
			// display list of products available
			System.out.println("Samsung products available:");
			for (int i = 0; i < Samsung.length; i++) {

				System.out.println(Samsung[i]);
			}

			// user's input on product
			System.out.println("Enter product name:");
			productName = sc.next();

			// check if productName matches product in the list
			for (int i = 0; i < Samsung.length; i++) {

				// if found, display the product selected
				if (Samsung[i].equals(productName)) {
					productFound = true;
					System.out.println("Product selected is: " + Samsung[i]);
					break;
				}

			}
			// if product not found, display error message
			if (!productFound) {
				System.out.println("Please select a product from the list");
			}
			break;
		}
		case 2: {
			// display list of products available
			System.out.println("Google products available:");
			for (int i = 0; i < Google.length; i++) {
				System.out.println(Google[i]);
			}

			// user's input on product
			System.out.println("Enter product name:");
			productName = sc.next();

			// check if productName matches product in the list
			for (int i = 0; i < Google.length; i++) {

				// if found, display the product selected
				if (Google[i].equals(productName)) {
					productFound = true;
					System.out.println("Product selected is: " + Google[i]);
					break;
				}

			}
			// if product not found, display error message
			if (!productFound) {
				System.out.println("Please select a product from the list");
			}
			break;
		}
		case 3: {

			// display list of products available
			System.out.println("Apple products available:");
			for (int i = 0; i < Apple.length; i++) {
				System.out.println(Apple[i]);
			}

			// user's input on product
			System.out.println("Enter product name:");
			productName = sc.next();

			// check if productName matches product in the list
			for (int i = 0; i < Apple.length; i++) {

				// if found, display the product selected
				if (Apple[i].equals(productName)) {
					productFound = true;
					System.out.println("Product selected is: " + Apple[i]);
					break;
				}

			}
			// if product not found, display error message
			if (!productFound) {
				System.out.println("Please select a product from the list");
			}
			break;
		}
		default:
			System.out.println("Enter valid phone brand name!!!!!");
		}
	}

}

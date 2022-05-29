package assignment2_Java;

import java.util.Scanner;

public class ShopCapacity {

	public static void main(String[] args) {

		int maxShopCapacity = 50;
		int entryCount = 0;
		System.out.println("Enter number of people trying to enter (entryCount): ");
		Scanner sc = new Scanner(System.in);
		entryCount = sc.nextInt();
		int peopleInStore = 0;
		System.out.println("Enter number of people currently in store: ");
		Scanner sc1 = new Scanner(System.in);
		peopleInStore = sc1.nextInt();

		while (peopleInStore <= maxShopCapacity) {
			if (entryCount == 0) {
				break;
			}
			peopleInStore += entryCount;
			System.out.println("No. of people trying to enter the store: " + entryCount);

			if (peopleInStore >= 50) {
				if (peopleInStore > 50) {
					System.out.println(
							"Cannot allow to enter all !!!\n" + (peopleInStore - 50) + " people will have to wait ");
				}
				peopleInStore = 50;
				System.out.println("Maximum Capacity Reached in Store");
				System.out.println("Number of people in store: " + peopleInStore);
				break;
			}
			System.out.println("Number of people in store currently:" + peopleInStore);
		}
		sc.close();
		sc1.close();
	}
}

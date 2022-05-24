package assignment2_Java;

public class ShopCapacity {

	public static void main(String[] args) {

		int maxShopCapacity = 50;
		int currentCount = 48;
		if (currentCount > 50) {
			System.out.println(
					"Maximum capacity of 50 people reached, \n Cannot serve more people due to Covid restrictions !!!");
		} else {
			while (currentCount <= maxShopCapacity) {
				if (currentCount == 50) {
					System.out.println("***Maximum capacity of 50 reached***");
					break;
				}
				System.out.println("Number of People in Shop: " + currentCount);
				currentCount++;
				System.out.println("Adding next customer...");
			}
			System.out.println("Total Number of People in Shop: " + currentCount);
		}
	}
}

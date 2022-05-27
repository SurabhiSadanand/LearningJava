package assignment2_Java;

public class ShopCapacity {

	public static void main(String[] args) {

		int maxShopCapacity = 50;
		int currentCount = 48;
		int entryCount=2;
		int exitCount=1;
		System.out.println("Current count of people in the shop: "+ (currentCount));
		if (currentCount >= 50) {
			System.out.println(
					"Maximum capacity of 50 people reached, \n Cannot serve more people due to Covid restrictions !!!");
		} else {
		while (currentCount+entryCount-exitCount< maxShopCapacity) {
				
				if((maxShopCapacity - currentCount) >=entryCount&& (currentCount + entryCount -exitCount) < maxShopCapacity) {
					System.out.println("Adding "+ entryCount+ " people in the shop");
					currentCount= currentCount + entryCount;
					System.out.println("Number of People in Shop: " + currentCount);
				}
				if(currentCount+entryCount>maxShopCapacity)
				{
					System.out.println("Cannot add entrycount of "+entryCount);
				}
				if(currentCount>=50) {
					System.out.println(
							"Maximum capacity of 50 people reached, \n Cannot serve more people due to Covid restrictions !!!");
				}
			}
			System.out.println("Total Number of People in Shop: " + currentCount);
		}
	}
}

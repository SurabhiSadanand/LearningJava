package ConditionalStatements;

public class TankExample {

	public static void main(String[] args) {
		int maxCapacity = 100;
		int bucketCapacity = 10;
		int currentCapacity = 0;
		while (currentCapacity < maxCapacity) {

			if (currentCapacity >= 90) {

				break;
			}
			currentCapacity = currentCapacity + bucketCapacity;
		}
		System.out.println("Current Capacity: " + currentCapacity);
	}

}

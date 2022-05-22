package ConditionalStatements;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 35;
		int c = 12;
		System.out.println("Three numbers to be tested are: " + a + "," + b + "," + c);
		if ((a > b) && (a > c)) {
			System.out.println("\nThe greatest number is: " + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("\nThe greatest number is: " + b);
		} else {
			System.out.println("\nThe greatest number is: " + c);
		}

	}

}

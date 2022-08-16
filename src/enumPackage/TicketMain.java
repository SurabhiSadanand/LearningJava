package enumPackage;

public class TicketMain {

	public static void main(String[] args) {

		TicketCategory tc = TicketCategory.CRITICAL;
		switch (tc) {
		case LOW:
			System.out.println("This is a low priority ticket");
			break;
		case HIGH:
			System.out.println("This is a high priority ticket");
			break;
		case MEDIUM:
			System.out.println("This is a medium priority ticket");
			break;
		case CRITICAL:
			System.out.println("This is a critical priority ticket");
			break;
		}

		// values() method is used to get an array of all predefined constant values in
		// an enum type
		System.out.println("\n---values() method:---");
		for (TicketCategory category : TicketCategory.values()) {

			System.out.println("Printing: " + category);

		}

		/*
		 * ordinal(): each constant value in enum contains an internal reference number
		 * that corresponds to the order in which thay are declared starting from 0 By
		 * using this method,we can get internal reference number for each enum constant
		 */
		System.out.println("\n---ordinal() method:---");
		System.out.println("Ordinal index for HIGH: " + tc.HIGH.ordinal());
		System.out.println("Ordinal index for LOW: " + tc.LOW.ordinal());

		// valueOf(): used to return an enum constant of the specified string value if
		// it exists
		System.out.println("\n---valueOf() method:---");
		System.out.println("Value of Critical: " + tc.valueOf("CRITICAL"));
		System.out.println("Value of Medium: " + tc.valueOf("MEDIUM"));

		// toString(): method used to get String value for the given enum constant
		// toString() gets implicitly called if we try to print an enum constant
		System.out.println("\n---toString() method:---");
		System.out.println("Value of Critical: " + tc.CRITICAL.toString());
		System.out.println("Value of Critical: " + tc.LOW.toString());

	}
}
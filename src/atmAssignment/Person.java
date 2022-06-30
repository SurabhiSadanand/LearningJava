package atmAssignment;

public class Person {

	public String accountHolderName;
	public long accountNumber;
	public String accountType;
	public double fundsAvailable;
	private int pin;

	Person(String accHolderName, int accNumber, String accType, int accBal, int accPin) {
		accountHolderName = accHolderName;
		accountNumber = accNumber;
		fundsAvailable = accBal;
		accountType = accType;
		pin = accPin;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int pin() {
		return pin;
	}
}

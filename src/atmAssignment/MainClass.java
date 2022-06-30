package atmAssignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Person surabhi = new Person("Surabhi", 123456789, "Savings", 25000, 9876);
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int count = 1;
		boolean isPinCorrect = false;
		int n;
		System.out.println("***Welcome to Demo Bank***");
		isPinCorrect = atm.checkPin(surabhi);

		if (isPinCorrect) {
			do {
				System.out.println("**Automated Teller Machine**");
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for EXIT");
				System.out.print("Choose the operation you want to perform:");
				n = sc.nextInt();
				switch (n) {
				case 1:

					isPinCorrect = atm.checkPin(surabhi);
					if (isPinCorrect) {
						System.out.println("Enter the amount to be deposit: ");
						double depositAmount = sc.nextDouble();
						System.out.println("Insert cash in ATM machine");
						atm.depositCash(surabhi, depositAmount);
					} else {
						System.out.println("Enter correct pin");
						break;
					}
					break;
				case 2:

					isPinCorrect = atm.checkPin(surabhi);
					if (isPinCorrect) {
						System.out.println("Enter the amount to withdraw");
						double withdrawAmount = sc.nextDouble();
						atm.withdrawCash(surabhi, withdrawAmount);
					} else {
						System.out.println("Enter correct pin");
						break;
					}
					break;
				case 3:

					isPinCorrect = atm.checkPin(surabhi);
					if (isPinCorrect) {
						System.out.println("Current balance:" + surabhi.fundsAvailable);
					} else {
						System.out.println("Enter correct pin");
						break;
					}
					break;
				case 4:
					break;
				default:
					System.out.println("Enter a valid option from the menu");
					break;

				}
			} while (n != 4);
		} else {
			System.out.println("Incorrect Pin entered");
			if (count > 3) {
			}
		}
		sc.close();
	}

}

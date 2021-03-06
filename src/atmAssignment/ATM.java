package atmAssignment;

import java.util.Scanner;

public class ATM {

	Scanner sc = new Scanner(System.in);
	double dailyCashLimit = 10000;
	Person surabhi = new Person();
	int noOfAttempts = 0;

	boolean checkPin(Person surabhi) {
		    
			System.out.println("Enter PIN");
			int enteredPin = sc.nextInt();
			noOfAttempts++;

			while (enteredPin != surabhi.pin() && noOfAttempts < 3) {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.println("Enter PIN: ");
                enteredPin = sc.nextInt();
                noOfAttempts++;
            }
			if (enteredPin == surabhi.pin()) 
				return true;

			 
            else if (noOfAttempts >= 3) 
               System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		       return false;
            
	}

	public void depositCash(Person surabhi, double depositAmount) {

		surabhi.fundsAvailable += depositAmount;
		System.out.println("Current Balance = " + surabhi.fundsAvailable);
		// return balanceAfterdeposit;
	}

	void withdrawCash(Person surabhi, double withdrawAmount) {

		surabhi.fundsAvailable -= withdrawAmount;
		if (withdrawAmount <= dailyCashLimit) {
			if (withdrawAmount <= surabhi.fundsAvailable) {
				System.out.println("Please collect the cash");

			} else {
				System.out.println("Insufficient balance");
			}
			dailyCashLimit -= withdrawAmount;
			System.out.println("Current Balance = " + surabhi.fundsAvailable);

		} else {
			System.out.println("Amount is greater than daily transaction limit");
		}

	}

}

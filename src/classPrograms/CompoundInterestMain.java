package classPrograms;

import java.util.Scanner;

public class CompoundInterestMain {

	public static void main(String[] args) {

		CompoundInterest ci = new CompoundInterest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		int principal = sc.nextInt();
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter time: ");
		int time = sc.nextInt();
		double amount = ci.calculateInterest(principal, rate, time);
		System.out.println("Investment balance: " + amount);
		sc.close();
	}

}

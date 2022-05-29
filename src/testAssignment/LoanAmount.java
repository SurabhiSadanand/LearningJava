package testAssignment;
import java.util.Scanner;

public class LoanAmount {

	public static void main(String[] args) {

		double loanAmount=0;
		double monthlyPayment;
		double remainingAmount;
		System.out.println("Enter the loan amount:");
		Scanner sc=new Scanner(System.in);
		loanAmount=sc.nextDouble();
		remainingAmount=loanAmount;
		for(int month=1;month<=3;month++)
		{
			
			monthlyPayment=0.10 * remainingAmount;
			
			remainingAmount-=monthlyPayment;
			
		}
		System.out.println("Remaining amount owing after 3 months: "+remainingAmount);
		sc.close();
	}

}

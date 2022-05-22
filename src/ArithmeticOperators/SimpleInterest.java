package ArithmeticOperators;

public class SimpleInterest {

	public static void main(String[] args) {
		double principal = 1000;
		double rate = 8;
		double time = 2;
		double interest;
		interest = (principal * rate * time)/100;
		System.out.println("Principal: " + principal);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Simple Interest: " + interest);

	}

}

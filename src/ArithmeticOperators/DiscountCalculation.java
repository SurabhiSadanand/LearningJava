package ArithmeticOperators;

public class DiscountCalculation {

	public static void main(String[] args) {
		double discountRate=25;
		double markedPrice=1000;
		double totalAmount;
		System.out.println("Marked price: "+markedPrice);
		System.out.println("Discount rate: "+discountRate);
		double saleRate=100 - discountRate;
		totalAmount = (saleRate*markedPrice)/100;
		System.out.println("Amount after discount: "+totalAmount);
	}

}

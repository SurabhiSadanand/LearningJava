package assignment2_Java;

public class DiscountCalculator {

	public static void main(String[] args) {
		int discountPercentage = 50;
		double productPrice = 100;
		System.out.println("Actual Price of the product: " + productPrice + "$");
		String promoCode = "Promo10";
		System.out.println("Default Discount Rate: " + discountPercentage + "%");
		System.out.println("Promo Code applied on product: " + promoCode);
		if (promoCode.equals("Promo5")) {

			discountPercentage += 5;

		} else if (promoCode.equals("Promo10")) {

			discountPercentage += 10;

		} else if (promoCode.equals("Promo20")) {

			discountPercentage += 20;

		} else {
			System.out.println("Invalid PromoCode Applied!!!!!!!\nOnly Default discount rate will be applied ");
		}
		System.out.println("Total discount applied on product for this PromoCode: " + discountPercentage + "%");
		productPrice -= (productPrice * discountPercentage) / 100;
		System.out.println("Product Price after discount applied: " + productPrice + "$");
	}

}

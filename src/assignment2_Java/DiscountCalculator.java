package assignment2_Java;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		int discountPercentage = 50;
		double productPrice = 0;
		System.out.println("Enter promocode:");
		
		
		Scanner sc = new Scanner(System.in);
	    String promoCode = sc.next();
	    
	    System.out.println("Enter product Price:");
	    
	    Scanner sc1= new Scanner(System.in);
	    productPrice= sc1.nextDouble();
	    
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
	    sc.close();
	    sc1.close();
	}

}

package classPrograms;

import java.util.Scanner;

public class InvoiceMain {

	public static void main(String[] args) {
		Invoice inv = new Invoice();
		Product[] p = new Product[2];
		String name;
		double pricePerUnit;
		int quantity;
		String description;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter product" + (i + 1) + " name: ");
			name = sc.next();
			System.out.println("Enter product" + (i + 1) + " price per unit: ");
			pricePerUnit = sc.nextDouble();
			System.out.println("Enter product" + (i + 1) + " description: ");
			description = sc.next();
			p[i] = new Product(name, pricePerUnit, description);
			System.out.println("Enter quantity of product" + (i + 1));
			quantity = sc.nextInt();
			double amt = inv.generateInvoice(p[i], quantity);
			System.out.println("Total amount for product" + (i + 1) + ": " + amt);
		}

		sc.close();
	}

}

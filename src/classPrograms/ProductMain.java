package classPrograms;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product[] p = new Product[10];
		String name;
		double pricePerUnit;
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
		}

		for (int j = 0; j < p.length; j++) {
			p[j].printProductDetails();
		}
		sc.close();
	}
}

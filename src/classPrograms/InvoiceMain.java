package classPrograms;

import java.util.Scanner;

public class InvoiceMain {

	public static void main(String[] args) {
		Invoice inv = new Invoice();
		Product[] productsSelected = new Product[3];

		productsSelected[0] = new Product("Hoodies", 20, "Full length", 2);
		productsSelected[1] = new Product("Jeans", 40, "Denim", 5);
		productsSelected[2] = new Product("Dresses", 30, "Summer Special", 10);

		double invoiceAmount;
		invoiceAmount = inv.generateInvoice(productsSelected);
		System.out.println("Invoice total for products selected:" + invoiceAmount);

		double amountAfterTax;
		amountAfterTax = inv.amountAfterTax(invoiceAmount);
		System.out.println("Invoice including tax:" + amountAfterTax);
	}

}

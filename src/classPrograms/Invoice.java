package classPrograms;

public class Invoice {
	double generateInvoice(Product[] p) {
		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total = p[i].pricePerUnit * p[i].quantity;
		}
		return total;
	}

	double amountAfterTax(double invoiceAmount) {
		double totalAmt = invoiceAmount + (0.13 * invoiceAmount);
		return totalAmt;
	}
}

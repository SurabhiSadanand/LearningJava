package classPrograms;

public class Invoice {

	double generateInvoice(Product p, int quantity) {
		return p.pricePerUnit * quantity;
	}
}

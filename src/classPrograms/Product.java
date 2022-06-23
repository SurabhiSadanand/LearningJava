package classPrograms;

public class Product {

	String name;
	double pricePerUnit;
	String description;

	Product(String pname, double price, String desc) {
		name = pname;
		pricePerUnit = price;
		description = desc;
	}

	void printProductDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Product price per unit: " + pricePerUnit);
		System.out.println("Product description: " + description);
	}
}

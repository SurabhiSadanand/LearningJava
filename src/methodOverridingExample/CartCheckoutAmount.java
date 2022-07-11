package methodOverridingExample;

public class CartCheckoutAmount {

	protected double itemsTotalPrice;
	protected double shippingCharge;
	protected double orderTotalPrice;

	// Constructor for class CartCheckoutamount
	CartCheckoutAmount(double priceOfItems, double shippingCost) {

		itemsTotalPrice = priceOfItems;
		shippingCharge = shippingCost;
	}
    CartCheckoutAmount()
    {
    	    }
	// getter and setter for class variables
	public double getItemsTotalPrice() {
		return itemsTotalPrice;
	}

	public void setItemsTotalPrice(double itemsTotalPrice) {
		this.itemsTotalPrice = itemsTotalPrice;
	}

	public double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public double calculateTotal() {
		orderTotalPrice = itemsTotalPrice + shippingCharge;
		return orderTotalPrice;
	}

}

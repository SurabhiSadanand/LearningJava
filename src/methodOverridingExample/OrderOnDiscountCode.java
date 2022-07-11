package methodOverridingExample;

public class OrderOnDiscountCode extends CartCheckoutAmount{

	double discountAmount;
	
	public OrderOnDiscountCode(double discount) {
		discountAmount= discount;
	}
    @Override
	public double calculateTotal() {
		orderTotalPrice = itemsTotalPrice + shippingCharge-discountAmount;
		return orderTotalPrice;
	}
}

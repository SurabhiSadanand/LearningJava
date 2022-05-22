
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first = 10;
		int second =20;
		System.out.println("-----Before Swap------");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("\n-----After Swap------");
		System.out.println("The first number is: "+first);
		System.out.println("The second number is: "+second);

	}

}

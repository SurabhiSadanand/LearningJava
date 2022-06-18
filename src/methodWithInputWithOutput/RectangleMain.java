package methodWithInputWithOutput;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		int area1 = r1.area(4, 5);
		System.out.println(" Area of rectangle 1: " + area1);

		int area2 = r2.area(5, 8);
		System.out.println(" Area of rectangle 2: " + area2);

	}

}

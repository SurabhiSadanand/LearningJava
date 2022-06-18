package methodWithoutInputWithOutput;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.length = 4;
		r1.breadth = 5;
		int area1 = r1.area();
		System.out.println("Area of rectangle: " + area1);
		r2.length = 5;
		r2.breadth = 8;
		int area2 = r2.area();
		System.out.println("Area of rectangle: " + area2);

	}

}

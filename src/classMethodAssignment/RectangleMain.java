package classMethodAssignment;

public class RectangleMain {

	public static void main(String[] args) {

		int area1;
		int area2;
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		area1 = r1.Area(4, 5);
		area2 = r2.Area(5, 8);
		System.out.println("Area of rectangle with sides 4,5: " + area1);
		System.out.println("Area of rectangle with sides 5,8: " + area2);
	}

}

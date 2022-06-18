package methodWithoutInputWithoutOutput;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.length = 4;
		r1.breadth = 5;

		r2.length = 5;
		r2.breadth = 8;

		r1.area();
		r2.area();

	}

}

package methodOverridingExample;

public class ShapesMain {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(15,20);
		System.out.println("Area of rectangle: "+r1.getArea());
		
		Ellipse e1=new Ellipse(5,10);
		System.out.println("Area of ellipse: "+e1.getArea());
		
		Triangle t1=new Triangle(10,20);
		System.out.println("Area of triangle: "+t1.getArea());

	}

}

package methodOverridingExample;

public class Rectangle extends Shapes{
//    int length;
//    int breadth;
    
    Rectangle(int l,int b)
    {
    	super(l,b);
//    	length=l;
//    	breadth=b;
    }
    @Override
	public double getArea()
	{
//		area=length*breadth;
//		System.out.println("Area of rectangle: "+);
		return side1*side2;
	}
}

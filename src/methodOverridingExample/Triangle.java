package methodOverridingExample;

public class Triangle extends Shapes{
//	int base;
//    int height;
    
    Triangle(int b,int h)
    {
    	super(b,h);
//    	base=b;
//    	height=h;
    }
	public double getArea()
	{
//		area=0.5*base*height;
//		System.out.println("Area of triangle: "+area);
		return 0.5*side1*side2;
		
	}
}

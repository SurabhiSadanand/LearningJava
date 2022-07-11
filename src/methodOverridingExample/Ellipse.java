package methodOverridingExample;

public class Ellipse extends Shapes {

//	int axis1;
//    int axis2;
    
    Ellipse(int a1,int a2)
    {
    	super(a1,a2);
//    	axis1=a1;
//    	axis2=a2;
    }
	public double getArea()
	{
//		area=3.14*axis1*axis2;
//		System.out.println("Area of ellipse: "+area);
		return 3.14*side1*side2;
	}
}

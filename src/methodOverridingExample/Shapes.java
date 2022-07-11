package methodOverridingExample;

public class Shapes {

	int side1;
	int side2;
	double area;
	Shapes(int firstSide,int secondSide)
	{
		side1=firstSide;
		side2=secondSide;
		
	}
	Shapes()
	{
		
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public double getArea()
	{
		//area=side1*side2;
		return area;
	}
}

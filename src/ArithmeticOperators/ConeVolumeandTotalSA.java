package ArithmeticOperators;

public class ConeVolumeandTotalSA {

	public static void main(String[] args) {
		double pi=3.14;
		double r=3;
		double h=5;
		double l= 5.83;
		double surfaceArea=(pi*r*r) + (pi*r*l);
		double volume= (pi*r*r*h)/3;
		System.out.println("Radius of cone:"+ r);
		System.out.println("Height of cone:"+ h);
		System.out.println("Slant height of cone:"+ l);
		System.out.println("Total surface area of cone: "+surfaceArea);
		System.out.println("Volume of cone: "+volume);
		
	}

}

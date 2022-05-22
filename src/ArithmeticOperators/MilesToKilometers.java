package ArithmeticOperators;

public class MilesToKilometers {

	public static void main(String[] args) {
		double miles= 4;
		double kilometers;
		double meters;
		double cm;
		double mm;
		kilometers = miles * 1.60934;
		System.out.println("Distance in Miles: "+miles);
		System.out.println("Distance in kilometers: "+kilometers);
		meters=kilometers *1000;
		System.out.println("Distance in meters: "+meters);
		cm = meters * 100;
		System.out.println("Distance in centimeters: "+cm);
		mm = cm * 10;
		System.out.println("Distance in millimeters: "+mm);

	}

}

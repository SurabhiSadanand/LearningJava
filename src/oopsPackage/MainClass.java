package oopsPackage;

public class MainClass {

	public static void main(String[] args) {

		Employee employee = new Employee(89795);
		

		System.out.println("Sin num :" + employee.getSinNumber());

		//employee.setSinNumber(23456, true, 6666);

		System.out.println("Sin num :" + employee.getSinNumber());

		//employee.setSinNumber(342432, false, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

		// only CRA can change the SIN Number

		//employee.setSinNumber(23456, true, 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

	}

}

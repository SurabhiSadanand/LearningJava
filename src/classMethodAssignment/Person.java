package classMethodAssignment;

public class Person {

	double height;
	double weight;
	boolean isEligibleToRide()
	{
		if(height<90 || height>200)
		{
			System.out.println("Height criteria doesnot match");
			if(weight<15 || weight>95)
			{
				System.out.println("Weight criteria doesnot match");
				return false;
			}
			return false;
		}
		if(weight<15 || weight>95)
		{
			System.out.println("Weight criteria doesnot match");
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
}

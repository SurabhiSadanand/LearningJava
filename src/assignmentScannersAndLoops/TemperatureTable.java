package assignmentScannersAndLoops;

import java.util.Scanner;

public class TemperatureTable {

	public static void main(String[] args) {
		
		double C=0;
		double F=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius:");
		C=sc.nextDouble();
		if(C==0)
		{
			C=-20.00;
			System.out.println(" Celsius Fahrenheit");
			while(C<=25)
			{
			   F = (C * 9 / 5) + 32;
			   
			   System.out.println(C+"\t"+F);
			   C+=5;
			}
			
		}
		else
		{
			F = (C * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit: "+F);
		}
        sc.close();
        
	}

}

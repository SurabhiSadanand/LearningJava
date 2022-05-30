package assignmentScannersAndLoops;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		
		int number=0;
		String choice="";
		Scanner sc=new Scanner(System.in);
		int count=0;
		do
		{
			System.out.println("Enter the number:");
			number=sc.nextInt();
			count++;
			System.out.println("Do you want to continue(Y/N): ");
			choice=sc.next();
		}while(choice.equals("Y")||choice.equals("y"));
        System.out.println("Count of numbers input:"+count);
        sc.close();
	}

}

package switchStatementsArrayAssignment;

import java.util.Scanner;

public class ArrayInitializing {

	public static void main(String[] args) {

		/*
		 * In Java, we can create and initialize array in different ways: int[] num= new
		 * int[3] int num[]=new int[3]; int[] num={1,2,3}; int num[]={1,2,3};
		 * 
		 * Or initializing using array index in separate lines int num[0]=1; int
		 * num[1]=2; int num[3]=3;
		 * 
		 * Or Populating the array using for loop
		 * 
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * System.out.println("Enter the " + (i) + " number); num[i] = sc.next(); }
		 * 
		 * Following is a program that shows the creation/initialization in array using
		 * first two ways
		 */

		int[] evenNumbers = new int[4];
		evenNumbers[0] = 2;
		evenNumbers[1] = 4;
		evenNumbers[2] = 6;
		evenNumbers[3] = 8;

		int[] oddNumbers = { 3, 5, 7, 9 };
		
		int choice;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Which list you want to view:");
		System.out.println("1.Even Numbers");
		System.out.println("2.Odd Numbers");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("The list of 4 even numbers:");
		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.println(evenNumbers[i]);
		}
		break;
		case 2:
			
		System.out.println("The list of 4 odd numbers:");
		for (int i = 0; i < oddNumbers.length; i++) {
			System.out.println(oddNumbers[i]);
		}
		break;
		default:
			System.out.println("Enter valid input");

	}

}
	
}


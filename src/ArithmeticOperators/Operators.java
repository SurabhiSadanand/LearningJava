package ArithmeticOperators;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//Arithmetic operators
		System.out.println("--------Arithmetic Operators--------");
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Difference of a and b is: "+(a-b));
		System.out.println("Multiplication of a and b gives: "+(a*b));
		System.out.println("Division of a and b is: "+(a/b));
		System.out.println("Modulus of a and b is: "+(a%b));
		
		//Relational Operators/ Comparison Operators
		System.out.println("\n--------Relational Operators--------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical Operators
		boolean x = true;
		boolean y = false;
		System.out.println("\n--------Logical Operators--------");
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Increment/decrement Operators
		a = 10;
		a++;
		System.out.println(a);
		
		b=20;
		b--;
		System.out.println(b);
		
		
	}

}

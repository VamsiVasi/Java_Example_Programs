package mypack;
import java.util.*;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			int a,b;
			System.out.println("Enter the Value of A :");
			a=sc.nextInt();
			System.out.println("Enter the Value of B :");
			b=sc.nextInt();
			System.out.println("Addition Of A and B is : "+(a+b));
			System.out.println("Subtraction Of A and B is : "+(a-b));
			System.out.println("Multiplication Of A and B is : "+(a*b));
			System.out.println("Division Of A and B is "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division Of A and B is undefined");
		}
	}

}

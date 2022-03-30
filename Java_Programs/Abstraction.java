package mypack;
import java.util.*;
abstract class arthimetic
{
	abstract void sum(int p,int q);
	abstract void multiply(int p,int q);
	abstract void sub(int p,int q);
	abstract void divide(int p,int q);
}
class result extends arthimetic
{
	void sum(int x,int y)
	{
		System.out.println("Sum = "+(x+y));
	}
	void multiply(int x,int y)
	{
		System.out.println("Product = "+(x*y));
	}
	void sub(int x,int y)
	{
		System.out.println("Subtraction = "+(x-y));
	}
	void divide(int x,int y)
	{
		System.out.println("Division = "+(x/y));
	}
}
 
public class Abstraction {

	public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a and b : ");
	a=sc.nextInt();
	b=sc.nextInt();
	result r=new result();
	r.sum(a, b);
	r.divide(a, b);
	r.sub(a, b);
	r.multiply(a, b);
	}

}

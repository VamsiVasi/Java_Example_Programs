package mypack;
import java.util.*;

class Addition
{
	void sum(int a,int b)
	{
		System.out.println("Addition of first two numbers : "+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("Addition of first three numbers : "+(a+b+c));
	}
	void sum(int a,int b,int c,int d)
	{
		System.out.println("Addition of first four numbers : "+(a+b+c+d));
	}
	void sum(int a,int b,int c,int d,int e)
	{
		System.out.println("Addition of all numbers : "+(a+b+c+d+e));
	}
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p,q,r,s,t;
		System.out.println("Enter your numbers to add : \n(Limit : 5 numbers only)");
		p=sc.nextInt();
		q=sc.nextInt();
		r=sc.nextInt();
		s=sc.nextInt();
		t=sc.nextInt();
		Addition ad=new Addition();
		ad.sum(p, q);
		ad.sum(p, q, r);
		ad.sum(p, q, r, s);
		ad.sum(p, q, r, s, t);
	}

}
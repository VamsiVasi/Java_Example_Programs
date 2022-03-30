package mypack;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,n,temp;
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		temp=n;
		System.out.print("The Fibonacci series for '"+temp+"' is "+a+" "+b);
		if(n>1)
		{
			for(int i=2;i<n;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
		}	
	}

}

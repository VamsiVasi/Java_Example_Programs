package mypack;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,f=1,temp;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		System.out.println("The Factorial of "+temp+" is "+f);
	}

}

package mypack;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int digit=0,n,a,temp,sum=0;
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			n=n/10;
			digit++;
		}
		n=temp;
		while(n>0)
		{
			int b=1;
			a=n%10;
			for(int i=1;i<=digit;i++)
			{
				b=b*a;
			}
			sum=sum+b;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The Entered Number "+temp+" is a Armstrong number");
		}
		else
		{
			System.out.println("The Entered Number "+temp+" is not a Armstrong number");
		}
	}
}

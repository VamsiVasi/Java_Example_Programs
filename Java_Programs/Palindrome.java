package mypack;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,temp,rev=0,r;
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("The Number : "+temp+" is a Palindrome");
		}
		else
		{
			System.out.println("The Number : "+temp+" is not a Palindrome");
		}
	}

}

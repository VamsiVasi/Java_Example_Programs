package mypack;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,k=1;
		System.out.println("Enter the number of rows you want : ");
		n=sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}

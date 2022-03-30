package mypack;
import java.util.*;

class Age
{
	void growth(int a)
	{
		if(a>=1&&a<=15)
		{
			System.out.println("Your are a Child");
		}
		else if(a>15)
		{
			System.out.println("Your are an Adult");
		}
	}
}
class Heart extends Age
{
	void rate(int a)
	{
		if(a>=1&&a<=15)
		{
			System.out.println("Your Heart rate should be 70-100 per min");
		}
		else if(a>15)
		{
			System.out.println("Your Heart rate should be 60-100 per min");
		}
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int x=sc.nextInt();
		Heart h=new Heart();
		h.growth(x);
		h.rate(x);
	}

}

package mypack;
import java.util.*;

class Mark
{
	void rank(int a,int b,int c)
	{
		if(a>35&&b>35&&c>35)
		{
			System.out.println("Mark passed and total marks are "+(a+b+c));
		}
		else
		{
			System.out.println("Mark failed and total marks are "+(a+b+c));
		}
	}
}
class Vasi extends Mark
{
	void rank(int a,int b,int c)
	{
		if(a>35&&b>35&&c>35)
		{
			System.out.println("Vasi passed and total marks are "+(a+b+c));
		}
		else
		{
			System.out.println("Vasi failed and total marks are "+(a+b+c));
		}
	}
}
class Krish extends Vasi
{
	void rank(int a,int b,int c)
	{
		if(a>35&&b>35&&c>35)
		{
			System.out.println("Krish passed and total marks are "+(a+b+c));
		}
		else
		{
			System.out.println("Krish failed and total marks are "+(a+b+c));
		}
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter the first subject marks : ");
		x=sc.nextInt();
		System.out.println("Enter the second subject marks : ");
		y=sc.nextInt();
		System.out.println("Enter the third subject marks : ");
		z=sc.nextInt();
		Mark m=new Mark();
		Vasi v=new Vasi();
		Krish k=new Krish();
		k.rank(x, y, z);
	}

}

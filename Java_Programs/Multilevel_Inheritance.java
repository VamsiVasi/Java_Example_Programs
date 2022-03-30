package mypack;
import java.util.*;

class person
{
	protected String name;
	protected int age;
	void enter_person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		name=sc.next();
		System.out.println("Enter your Age : ");
		age=sc.nextInt();
	}
	void show_person()
	{
		System.out.println("Name : "+name+"\nAge : "+age);
	}
	public int getage()
	{
		return age;
	}
}
class address extends person
{
	protected String street,city,state;
	void enter_address()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your street : ");
		street=sc.next();
		System.out.println("Enter your city : ");
		city=sc.next();
		System.out.println("Enter your state : ");
		state=sc.next();
	}
	void show_address()
	{
		System.out.println("Street : "+street+"\nCity : "+city+"\nState :"+state);
	}
}
class details extends address
{
	protected int exp;
	protected String edu;
	void enter_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number of Experience : ");
		exp=sc.nextInt();
		System.out.println("Enter your Course : ");
		edu=sc.next();
	}
	void show_details()
	{
		System.out.println("Experience : "+exp+"\nCourse :"+edu);
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details d=new details();
		d.enter_person();
		d.enter_details();
		d.enter_address();
		d.show_person();
		d.show_details();
		d.show_address();
		if(d.getage()>18)
		{
			System.out.println("* "+d.name+" you are Eligible *");
		}
		else
		{
			System.out.println("* "+d.name+" you are Not Eligible *");
		}
	}

}

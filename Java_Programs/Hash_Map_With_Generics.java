package mypack;

import java.util.*;

class Employee<I, N, R, P>
{
	I ob1;
	N ob2;
	R ob3;
	P ob4;
	Employee(I ob1,N ob2,R ob3,P ob4)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
		this.ob4=ob4;
	}
}
public class Hash_Map_With_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee> h1=new HashMap<>();
		Employee<Integer,String,String,Integer> w1=new Employee<Integer,String,String,Integer>(215326,"Vamsi Krishna","Assistant Software Engineer",349822438);
		h1.put(2,w1);
		System.out.println("Albanero Employee Details->");
		for(Map.Entry<Integer,Employee> entry:h1.entrySet())
		{
			Employee e=entry.getValue();
			System.out.println("\nEmployee Name : "+e.ob2+"\nEmployee ID : "+e.ob1+"\nEmployee Role : "+e.ob3+"\nEmployee Number : "+e.ob4);
		}
		System.out.println("\n* Adding Two More Employees *");
		Employee<Integer,String,String,Integer> w2=new Employee<Integer,String,String,Integer>(564545,"Uma","Assistant Software Engineer",56456333);
		Employee<Integer,String,String,Integer> w3=new Employee<Integer,String,String,Integer>(78565,"sk","Assistant Software Engineer",686565644);
		h1.put(1, w3);
		h1.put(3, w2);
		for(Map.Entry<Integer,Employee> entry:h1.entrySet())
		{
			Employee e=entry.getValue();
			System.out.println("\nEmployee Name : "+e.ob2+"\nEmployee ID : "+e.ob1+"\nEmployee Role : "+e.ob3+"\nEmployee Number : "+e.ob4);
		}
		h1.remove(1);
		System.out.println("\n* Sk Left.. *\nNow the remaining Employees are ->");
		for(Map.Entry<Integer,Employee> entry:h1.entrySet())
		{
			Employee e=entry.getValue();
			System.out.println("\nEmployee Name : "+e.ob2+"\nEmployee ID : "+e.ob1+"\nEmployee Role : "+e.ob3+"\nEmployee Number : "+e.ob4);
		}
		
	}

}

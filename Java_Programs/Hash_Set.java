package mypack;

import java.util.*;

class Wrestler1<T,U,X>
{
	T ob1;
	U ob2;
	X ob3;
	Wrestler1(T ob1,U ob2,X ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
}
public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Wrestler1> d= new HashSet();
		Wrestler1<Integer,String,String> w1=new Wrestler1<Integer,String,String>(72331,"Randy Orton","RKO");
		Wrestler1<Double,String,String> w2=new Wrestler1<Double,String,String>(213541.535,"Batista","Batista Bomb");
		Wrestler1<Float,String,String> w3=new Wrestler1<Float,String,String>(86531.23f,"Mysterio","619");
		d.add(w3);
		d.add(w2);
		d.add(w2);
		d.add(w1);
		d.add(w3);
		System.out.println("* Duplication Was Not Allowed *\n");
		for(Wrestler1 W:d)
		{
			System.out.println("* WWE *\nWrestler Name : "+W.ob2+"\nWrestler Move : "+W.ob3+"\nWrestler Pay : "+W.ob1);
		}
		System.out.println("\n* Batista Left *");
		d.remove(w2);
		for(Wrestler1 W:d)
		{
			System.out.println("\n* WWE *\nWrestler Name : "+W.ob2+"\nWrestler Move : "+W.ob3+"\nWrestler Pay : "+W.ob1);
		}
	}

}

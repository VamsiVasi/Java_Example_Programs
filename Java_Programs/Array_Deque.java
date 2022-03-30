package mypack;

import java.util.*;

class Wrestler<T,U,X>
{
	T ob1;
	U ob2;
	X ob3;
	Wrestler(T ob1,U ob2,X ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
}
public class Array_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Wrestler> d= new ArrayDeque();
		Wrestler<Integer,String,String> w1=new Wrestler<Integer,String,String>(72331,"Randy Orton","RKO");
		Wrestler<Double,String,String> w2=new Wrestler<Double,String,String>(213541.535,"Batista","Batista Bomb");
		Wrestler<Float,String,String> w3=new Wrestler<Float,String,String>(86531.23f,"Mysterio","619");
		d.addLast(w3);
		d.addFirst(w2);
		d.add(w1);
		for(Wrestler W:d)
		{
			System.out.println("* WWE *\nWrestler Name : "+W.ob2+"\nWrestler Move : "+W.ob3+"\nWrestler Pay : "+W.ob1);
		}
		System.out.println("* Batista Left *");
		d.pollFirst();
		for(Wrestler W:d)
		{
			System.out.println("\n* WWE *\nWrestler Name : "+W.ob2+"\nWrestler Move : "+W.ob3+"\nWrestler Pay : "+W.ob1);
		}
	}

}

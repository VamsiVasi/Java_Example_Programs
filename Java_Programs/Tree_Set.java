package mypack;

import java.util.*;

class Powerrangers implements Comparable<Powerrangers>
{
	int ob1;
	String ob2;
	String ob3;
	Powerrangers(int ob1,String ob2,String ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
	@Override
	public int compareTo(Powerrangers p) {
		// TODO Auto-generated method stub
		if(ob1>p.ob1)
		{
			return 1;
		}
		else if(ob1<p.ob1)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		Powerrangers w4=new Powerrangers(4536,"Dino Charge","Dino Charge Ultrazord");
		l.add(w4);
		Set<Powerrangers> d= new TreeSet(l);
		Powerrangers w1=new Powerrangers(12723,"Dino Thunder","Mezodon Megazord");
		Powerrangers w2=new Powerrangers(264135,"SPD","Delta Squad Megazord");
		Powerrangers w3=new Powerrangers(85651,"Ninja Storm","Storm Megazord");
		
		d.add(w3);
		d.add(w2);
		d.add(w2);
		d.add(w1);
		d.add(w3);
		
		System.out.println("* Duplication Was Not Allowed and arranged in a sorted way*\n");
		for(Powerrangers p:d)
		{
			System.out.println("* Power Rangers *\nPower Rangers "+p.ob2+"\nMegazord : "+p.ob3+"\nPower Level : "+p.ob1+"\n");
		}
		
	}

}

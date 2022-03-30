package mypack;

import java.util.*;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue l=new PriorityQueue();
		l.add("Power Rangers: ");
		l.add("SPD");
		l.add("Dino Thunder");
		l.add("Ninja Storm");
		l.add("Mystic Force");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		PriorityQueue p=new PriorityQueue();
		for(int i=5;i>=0;i--)
		{
			p.add(i);
		}
		Iterator i1=p.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

package mypack;

import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Power Rangers: ");
		l.add("SPD");
		l.add("Dino Thunder");
		l.add("Ninja Storm");
		l.add("Mystic Force");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			l.set(0, "Power Rangers ->");
			System.out.println(i.next());
		}
	}

}

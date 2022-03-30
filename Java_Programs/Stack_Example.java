package mypack;

import java.util.*;

public class Stack_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("Pokemon Details : ");
		s.push("1. Pikachu");
		s.push("2. Charizard");
		s.push("3. Squatrul");
		s.push("4. Bulbasaur");
		Stack s1=new Stack();
		s1.add("5. Tortodile");
		s.addAll(s1);
		Iterator i=s.iterator();
		System.out.println("* Here The Top Most Element in the Stack is "+s.peek()+" *\n");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		s.pop();
		System.out.println("\n* Now After pooping, The Top Most Element in the Stack is "+s.peek()+" *");
	}

}

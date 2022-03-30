package mypack;

import java.util.*;

class Pokemon1<T,U,X>
{
	T ob1;
	U ob2;
	X ob3;
	Pokemon1(T ob1,U ob2,X ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
}
public class Tree_Map_With_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Pokemon1> d= new TreeMap();
		Pokemon1<Integer,String,String> w1=new Pokemon1<Integer,String,String>(72331,"Pikachu","Thunder Bolt");
		Pokemon1<Double,String,String> w2=new Pokemon1<Double,String,String>(213541.535,"Tortodile","Water Gun");
		Pokemon1<Float,String,String> w3=new Pokemon1<Float,String,String>(865131.23f,"Charizard","Over Heat");
		
		d.put(2,w3);
		d.put(1,w1);
		d.put(3,w2);
		for(Map.Entry<Integer,Pokemon1> entry:d.entrySet())
		{
			int k=entry.getKey();
			Pokemon1 p=entry.getValue();
			System.out.println("* Pokemon *\nPokemon Name : "+p.ob2+"\nSpecial Move : "+p.ob3+"\nPower Level : "+p.ob1);
		}
		
	}

}

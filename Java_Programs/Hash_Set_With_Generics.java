package mypack;

import java.util.*;

class Pokemon<T,U,X>
{
	T ob1;
	U ob2;
	X ob3;
	Pokemon(T ob1,U ob2,X ob3)
	{
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}
}
public class Hash_Set_With_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		Pokemon<Double,String,String> w4=new Pokemon<Double,String,String>(6753453.535,"Blastoise","Hydropump");
		l.add(w4);
		HashSet<Pokemon> d= new HashSet(l);
		Pokemon<Integer,String,String> w1=new Pokemon<Integer,String,String>(72331,"Pikachu","Thunder Bolt");
		Pokemon<Double,String,String> w2=new Pokemon<Double,String,String>(213541.535,"Tortodile","Water Gun");
		Pokemon<Float,String,String> w3=new Pokemon<Float,String,String>(865131.23f,"Charizard","Over Heat");
		
		d.add(w3);
		d.add(w2);
		d.add(w2);
		d.add(w1);
		d.add(w3);
		
		System.out.println("* Duplication Was Not Allowed *\n");
		for(Pokemon W:d)
		{
			System.out.println("* Pokemon *\nPokemon Name : "+W.ob2+"\nSpecial Move : "+W.ob3+"\nPower Level : "+W.ob1);
		}
		
	}

}

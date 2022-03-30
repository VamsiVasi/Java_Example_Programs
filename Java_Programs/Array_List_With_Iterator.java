package mypack;
import java.util.*;

public class Array_List_With_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("-> Hai, My Name is Vasi");
		a.add("-> Address : Old Gajuwaka, Vsp-26.");
		a.add(0, "Details :");
		a.add("-> Phone : 3642632349");
		a.add(2, "-> I'm working at Albanero as Assistant Software Engineer");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			a.set(0, "My Details :");
			System.out.println(i.next());
		}
	}

}

package mypack;
import java.util.*;

public class Java8_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add("-> Hai, My Name is Vasi");
		a.add("-> Address : Old Gajuwaka, Vsp-26.");
		a.add(0, "Details :");
		a.add("-> Phone : 3642632349");
		a.add(2, "-> I'm working at Albanero as Assistant Software Engineer");
//		for(int i=0;i<a.size();i++)
//		{
//			System.out.println(a.get(i));
//		}
		a.forEach(i->System.out.println(i));
	}

}

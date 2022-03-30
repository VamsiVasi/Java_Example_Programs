package mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class Java8_Optional {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		ArrayList a = new ArrayList();
		HashSet m = new HashSet();
		a.add("Details->");
		a.add("Name : Vamsi");
		a.add("Domain : Java");
		a.add(null);
		a.add(m);
		Object str=a.get(2);
		Optional<HashSet> o = Optional.of(m);
		Optional<Object> o1 = Optional.of(str);
		Optional<HashSet> o2 = Optional.of(h);
		System.out.println("Set1 has values : " + o.isPresent());
		System.out.println("List has values : " + o1.isPresent());
		System.out.println("List values and Set2 values are equal : " + o1.equals(o2));
		System.out.println("Set1 values and Set2 values are euqal : " + o.equals(o2));
		System.out.println("List values : "+o1.toString());
		System.out.println("Set1 values : "+o.toString()+"\nSet2 values : "+o2.toString());
		o1.ifPresent(System.out::println);
	}

}

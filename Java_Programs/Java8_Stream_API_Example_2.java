package mypack2;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Wrestler {
	int ob1;
	String ob2;
	String ob3;

	public Wrestler(int ob1, String ob2, String ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}

}

public class Java8_Stream_API_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Wrestler> d = new ArrayList<Wrestler>();
		Wrestler w1 = new Wrestler(72331, "Randy Orton", "RKO");
		Wrestler w2 = new Wrestler(21354, "Batista", "Batista Bomb");
		Wrestler w3 = new Wrestler(86531, "Mysterio", "619");
		d.add(w1);
		d.add(w3);
		d.add(w2);
		Map<String, String> s = d.stream().collect(Collectors.toMap(i->i.ob2,i->i.ob3));
		System.out.println(s);
	}

}

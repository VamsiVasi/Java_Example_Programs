package mypack;

import java.util.StringJoiner;

public class Java8_String_Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner(" -> ");
		sj.add("Name");
		sj.add("Vamsi Krishna");
		sj.add("Role");
		sj.add("Assistant Software Engineer");
		StringJoiner sj1=new StringJoiner(" - ");
		sj1.add("Date Of Birth");
		sj1.add("29");
		sj1.add("April");
		sj1.add("1999");
		StringJoiner sm=sj.merge(sj1);
		System.out.println(sm);
	}

}

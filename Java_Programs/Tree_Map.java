package mypack;

import java.util.*;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> h1=new TreeMap<>();
		h1.put(9, "Employee Name : Vamsi Krishna");
		h1.put(10, "Employee ID : 215326");
		h1.put(11, "Employee Role : Assistant Software Engineer");
		h1.put(12, "Employee Number : 3498232438");
		h1.put(5, "Employee Name : Uma");
		h1.put(6, "Employee ID : 564545");
		h1.put(7, "Employee Role : Assistant Software Engineer");
		h1.put(8, "Employee Number : 56456333");
		h1.put(1, "Employee Name : sk");
		h1.put(2, "Employee ID : 78565");
		h1.put(3, "Employee Role : Assistant Software Engineer");
		h1.put(4, "Employee Number : 6867565644");
		System.out.println("Albanero Employee Details->");
		for(Map.Entry m:h1.entrySet())
		{
			System.out.println(m.getValue());
		}
		
		
	}

}

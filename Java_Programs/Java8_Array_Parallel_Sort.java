package mypack;

import java.util.Arrays;

public class Java8_Array_Parallel_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "Hai, My Name is Vasi", "Address : Old Gajuwaka, Vsp-26.", "Phone : 3642632349",
				"I'm working at Albanero as Assistant Software Engineer" };
		System.out.println("* Sort from index'1' to index'3' *");
		Arrays.parallelSort(str, 1, 3);
		for (String i : str) {
			System.out.println(i);
		}
		System.out.println("\n* Sort all *");
		Arrays.parallelSort(str);
		for (String i : str) {
			System.out.println(i);
		}
	}

}

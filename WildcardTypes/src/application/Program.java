package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		//List<String> myStrs = Arrays.asList("Abel", "João", "Rufino");
		//printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}

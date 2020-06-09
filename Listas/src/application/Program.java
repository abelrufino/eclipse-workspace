package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Abel");
		// list.add(3, "Abel");

		// list.remove(0);
		// list.remove("Abel");
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Abel: " + list.indexOf("Abel"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}

}

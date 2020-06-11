package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new LinkedHashSet<String>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		System.out.println(set.add("Smartfone"));
		System.out.println(set.remove("TV"));

		for (String p : set) {
			System.out.println(p);
		}
	}

}

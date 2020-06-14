package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> cookies = new TreeMap<String, String>();

		cookies.put("Username", "Abel");
		cookies.put("Email", "anetosib@hotmail.com");
		cookies.put("Phone", "99999-8888");

		cookies.remove("Email");
		cookies.put("Phone", "99999-7777");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
		System.out.println("Phone number: " + cookies.get("Phone"));
		System.out.println("Email: " + cookies.get("Email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}

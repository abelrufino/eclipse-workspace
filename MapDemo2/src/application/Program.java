package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Product, Double> stock = new HashMap<Product, Double>();

		Product p1 = new Product("TV", 950.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Product ps = new Product("TV", 900.0);
		stock.put(ps, 10000.0);

		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}

package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 1000.0));
		list.add(new Product("Notebook", 2199.0));
		list.add(new Product("Tablet", 799.0));

		/*
		 * Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product p1, Product p2) { // TODO Auto-generated
		 * method stub return
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); }
		 * 
		 * };
		 * 
		 */

		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};

		/*
		 * Comparator<Product> comp = (p1, p2) ->
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 */

		/*
		 * list.sort((p1, p2) ->
		 * p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		 */

		list.sort(comp);
		// list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p);
		}
	}

}

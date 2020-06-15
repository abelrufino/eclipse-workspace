package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.00));

		// list.removeIf(new ProductPredicate()); 
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		
		double mim = 100.0;
		
		/*
		Predicate<Product> pred = p -> p.getPrice() >= mim;
		list.removeIf(pred);
		*/
		list.removeIf(p -> p.getPrice() >= mim);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}

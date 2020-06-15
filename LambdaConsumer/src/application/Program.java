package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 79.90));
		list.add(new Product("HD Case", 89.90));
		list.add(new Product("Tablet", 350.50));

		// list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(Product::nonStaticPriceUpdate);
		
		double factor = 1.1;
		/*
		Consumer<Product> cons = p ->{
			p.setPrice(p.getPrice() * factor);
		};
		
		list.forEach(cons);
		*/
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
	}

}

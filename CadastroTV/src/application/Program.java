package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		// Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Price: ");
		double price = teclado.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = teclado.nextInt();
		Product product = new Product(name, price, quantity);
		
		System.out.println("");
		System.out.println("Product data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = teclado.nextInt();
		product.AddProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);
		
		System.out.println("");
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = teclado.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println("");
		System.out.println("Updated data: " + product);
		
		teclado.close();
	}

}

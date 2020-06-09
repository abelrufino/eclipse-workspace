package application;

import java.util.Scanner;

import services.PrintServices;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		PrintServices<String> ps = new PrintServices<String>();

		System.out.print("How many values? ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First:" + x);

		sc.close();
	}

}

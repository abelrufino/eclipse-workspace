package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;		
		
		System.out.print("Enter account number :");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder =sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);	
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposiValue = sc.nextDouble();
		account.deposit(deposiValue); 
		System.out.println("Update account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data");
		System.out.println(account.toString());
		
		sc.close();

	}

}

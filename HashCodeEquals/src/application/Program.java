package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String a = "Abel";
		String b = "Neto";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		*/
		
		Client c1 = new Client("Abel", "anetosib@gmail.com");
		Client c2 = new Client("Esther", "esther@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
			
		System.out.println(c1 == c2); // Tem o mesmo conteúdo porém a posição diferente na memory
		System.out.println(s1 == s2); 
		
		
		
	}

}

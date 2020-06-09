import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.println("");
		System.out.println("O que você digitou: "+nome);
		System.out.println("Sua idade : "+idade);
		teclado.close();
		
	}

}

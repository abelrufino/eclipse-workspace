import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int x = teclado.nextInt();
		int soma = 0;

		while (x != 0) {
			soma = soma + x; // soma += x;
			x = teclado.nextInt();
		}
		System.out.println("Soma de todos os números digitados é:" +soma);
		teclado.close();
	}

}

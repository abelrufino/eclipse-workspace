import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		double conta = 50.00;
		double minutos = teclado.nextDouble();
		
		if (minutos <= 100) {
			System.out.printf("Valor da Fatura: %.2f \n", conta);
		} else {
			conta = conta + (minutos - 100) * 2.0;
			System.out.printf("Valor da fatura: %.2f \n ", conta);
		}
			
		teclado.close();

	}

}

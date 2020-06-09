import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String Dia;
		int x = teclado.nextInt();

		switch (x) {
		case 1:
			Dia = "Domingo";
			break;
		case 2:
			Dia = "Segunda-feira";
			break;
		case 3:
			Dia = "Terça-feira";
			break;
		case 4:
			Dia = "Quarta-feira";
			break;
		case 5:
			Dia = "Quinta-feira";
			break;
		case 6:
			Dia = "Sexta-feira";
			break;
		case 7:
			Dia = "Sábado";
			break;

		default:
			Dia = "Valor ínvalido";
			break;
		}
		System.out.println("Dia da semana: " +Dia);
		teclado.close();

	}

}

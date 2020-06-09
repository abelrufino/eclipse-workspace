import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String result = (x > y) ? "V":"F";	
		
		System.out.println(result);
		sc.close();

	}

}

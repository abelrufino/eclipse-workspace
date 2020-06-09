
public class Algoritmo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y = 4;
		int z = 5;
		
		if ((x-1)>2) {
			y= y +1;
			
		} else {
			y = y - 1;
		}
		
		z = x + y;
		
		for (int i=1; i<=8; i++ ) {
			y = y + 1;
		}
		z = z + y;
		System.out.println(z);
	}

}

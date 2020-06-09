
public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); 
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("ToLowerCase: -"+ s01 + "-"); //Letras minuscula
		System.out.println("ToUpperCase: -"+ s02 + "-"); //Letras maiuscula
		System.out.println("Trim: -" +s03 + "-"); //Retira espaços
		System.out.println("Substring(2): -" +s04 + "-"); 
		System.out.println("Substring(2,9): -" +s05 + "-");
		System.out.println("Replace('a','x'): -" +s06 + "-"); // Aonde for a substituir por x
		System.out.println("Replace('abc','xy'): -" +s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		
		
	}

}

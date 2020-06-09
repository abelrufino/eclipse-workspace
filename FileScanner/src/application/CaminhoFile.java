package application;

import java.io.File;
import java.util.Scanner;

public class CaminhoFile {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter o folder path: ");
			String strPath = sc.nextLine();

			File path = new File(strPath);

			System.out.println("getPath: " + path.getName());
			System.out.println("getParent: " + path.getParent());
			System.out.println("getName: " + path.getName());
		}
	}

}

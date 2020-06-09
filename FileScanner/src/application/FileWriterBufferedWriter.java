package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lines = new String[] { "Bom dia ", "Boa tarde ", "Boa noite" };

		String path = "/home/abelrufino/Linux/File.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				
			}
			System.out.println(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

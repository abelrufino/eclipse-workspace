package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String pach = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(pach))) {
			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}

			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}

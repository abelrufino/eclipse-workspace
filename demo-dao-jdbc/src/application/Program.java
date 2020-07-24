package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Department obj = new Department(1, "Books");
		// Seller seller = new Seller(1, "Abel", "anetosib@gmail.com", new Date(),
		// 1700.0, obj);
		// System.out.println(obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("====== TEST 1: Seller findById ======");
		Seller seller = sellerDao.findById(5);
		System.out.println(seller);

		System.out.println("\n====== TEST 2: seller findByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);

		}
		
		System.out.println("\n====== TEST 3: seller findAll ======");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n====== TEST 4: seller insert ======");
		Seller newSeller = new Seller(null, "Esther Machado", "ester@hotmail.com", new Date(), 1500.0, department);
		sellerDao.insert(newSeller);
		System.out.printf("Inserted! New id", + newSeller.getId());
		
		
		System.out.println("\n====== TEST 5: seller update ======");
		seller = sellerDao.findById(9);
		seller.setName("Lúcia F C Rufino");
		seller.setEmail("luciafcrufino@gmail.com");
		seller.setBaseSalary(3000.0);
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n====== TEST 6: seller delete ======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}
}

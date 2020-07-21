package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	}
}

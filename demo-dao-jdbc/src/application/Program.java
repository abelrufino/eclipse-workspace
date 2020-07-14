package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Abel", "anetosib@gmail.com", new Date(), 1700.0, obj);
	//	System.out.println(obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(seller);
		
		
	}

}

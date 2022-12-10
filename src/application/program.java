package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	
	public static void main(String[] args) {
	
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		/*System.out.println("Print TEST 1 Seller find by ID");
		
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		
		/*System.out.println("Print TEST 2 Seller find by Department");
		
		List<Seller> list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}*/
		
		
		
		System.out.println("Print TEST 3 Seller find by Department");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, new Department(2, null));
		
		sellerDao.insert(newSeller);
		System.out.println("Inserted: " + newSeller.getId());
		
		
		
	}
	
	
}

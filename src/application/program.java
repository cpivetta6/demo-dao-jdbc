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
		*/
		
		System.out.println("Print TEST 2 Seller find by Department");
		
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
		
	}
	
	
}

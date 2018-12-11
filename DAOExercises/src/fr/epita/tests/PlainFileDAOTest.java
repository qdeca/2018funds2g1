package fr.epita.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import fr.epita.datamodel.Customer;
import fr.epita.services.dao.CustomerDAO;

public class PlainFileDAOTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setAddress("14 rue de la paix");
		customer.setName("Richard Wright");
		Customer customer2 = new Customer();
		customer2.setAddress("22 baker street");
		customer2.setName("Robert Bichon");
		
		File file = new File("customers.db");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		CustomerDAO dao = new CustomerDAO(file);
		dao.create(customer);
		dao.create(customer2);
	}
	
}

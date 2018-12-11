package fr.epita.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import fr.epita.datamodel.Customer;

public class PlainFileDAOTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setAddress("14 rue de la paix");
		customer.setName("Richard Wright");
		
		File file = new File("customers.db");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			PrintWriter writer = new PrintWriter(file);
			writer.write(customer.getName());
			writer.write("\n");
			writer.write(customer.getAddress());
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

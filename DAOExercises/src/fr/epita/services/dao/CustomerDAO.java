package fr.epita.services.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import fr.epita.datamodel.Customer;

public class CustomerDAO {

	
	private PrintWriter writer;
	
	
	
	public CustomerDAO(File file) {
		try {
			this.writer = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}



	public void create(Customer customer) {
		writer.write("-----------------");
		writer.write("\n");
		writer.write(customer.getName());
		writer.write("\n");
		writer.write(customer.getAddress());
		writer.write("\n");
		writer.write("-----------------");
		writer.write("\n");
		writer.flush();
	}
	
	
}

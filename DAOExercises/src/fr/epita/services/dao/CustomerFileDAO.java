package fr.epita.services.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import fr.epita.datamodel.Customer;

public class CustomerFileDAO {

	
	private PrintWriter writer;
	
	
	
	public CustomerFileDAO(File file) {
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
	
	public Customer read(String name, File file) throws IOException {
		List<String> fileLines = Files.readAllLines(file.toPath());
		Customer customer = new Customer();
		for (String line : fileLines) { // loop on all the lines of file
			if (name.equals(line)) {	// if the name matches the line
				customer.setName(name);  // put name in customer returned 
										 // at the end
				int index = fileLines.indexOf(line);
				customer.setAddress(fileLines.get(index+1)); // the line after is the address
				return customer;
			}
		}
		return null;
	}
	
	
}

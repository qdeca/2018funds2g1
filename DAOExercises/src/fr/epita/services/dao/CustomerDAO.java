package fr.epita.services.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
	
	public String read(String name, File file) throws IOException {
		List<String> fileLines = Files.readAllLines(file.toPath());
		for (String line : fileLines) { // loop on all the lines of file
			if (name.equals(line)) {
				return name;
			}
		}
		return null;
	}
	
	
}

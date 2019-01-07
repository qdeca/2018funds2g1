package fr.epita.services.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.epita.datamodel.Customer;

public class CustomerDAO {

	private static final String DB_PASSWORD = "";
	private static final String DB_USERNAME = "sa";
	private static final String DB_URI = "jdbc:h2:C:/Formation/db/h2DS";
										//"~/test/"

	public void create(Customer customer) {
		try {
			Connection connection = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD);    // establishing connection to DB 
			PreparedStatement statement = connection.prepareStatement("INSERT INTO CUSTOMER VALUES(?, ?)"); // setting up the SQL query
			statement.setString(1, customer.getName()); // passing name parameter to the query
			statement.setString(2, customer.getAddress()); // passing address parameter to the query
			statement.execute(); // executing query
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void updateName(Customer customer, String newName) {
		try {
			Connection connection = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD);    // establishing connection to DB 

			PreparedStatement statement = connection.prepareStatement("UPDATE CUSTOMER SET NAME= ? WHERE NAME= ?"); // setting up the SQL query
			statement.setString(1, newName); // passing new name
			statement.setString(2, customer.getName()); // passing current name
			statement.execute(); // executing query
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Customer> readByName(String name) { // search for any customer matching the given name
		List<Customer> listCustomers = new ArrayList<Customer>(); // empty list of result
		Connection connection;
		try {
			connection = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD); // establish connection
			PreparedStatement statement = connection.prepareStatement("SELECT NAME,ADDRESS FROM CUSTOMER WHERE NAME = ?"); // setting up the SQL query
			statement.setString(1, name); // passing name parameter to the query
			ResultSet result =  statement.executeQuery(); // executing query
			while(result.next()) {  // for all customers matching the name
				String SQLName = result.getString(1); // get match name
				String SQLAddress = result.getString(2); //get match address
				Customer foundCustomer = new Customer();  // put it in a customer
				foundCustomer.setName(SQLName);
				foundCustomer.setAddress(SQLAddress);
				listCustomers.add(foundCustomer); // add customer to the result list
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}    
		return listCustomers;
	}
	
	
	public void delete(Customer customer) {

		try {
			Connection connection = DriverManager.getConnection(DB_URI, DB_USERNAME, DB_PASSWORD);    // establishing connection to DB 
			PreparedStatement statement = connection.prepareStatement("DELETE FROM CUSTOMER WHERE NAME = ? AND ADDRESS = ?");
			statement.setString(1, customer.getName()); // passing name parameter to the query
			statement.setString(2, customer.getAddress()); // passing address parameter to the query
			statement.execute(); // executing query
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // setting up the SQL query

	}
}

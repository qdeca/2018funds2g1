package fr.epita.services.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}

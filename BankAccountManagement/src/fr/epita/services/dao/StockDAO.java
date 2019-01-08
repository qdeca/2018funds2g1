package fr.epita.services.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.epita.datamodel.Stock;
import fr.epita.services.Configuration;

public class StockDAO {

	private String databaseURL;
	private String databaseUsername;
	private String databasePassword;
	
	public StockDAO() {
		Configuration config = Configuration.getInstance();  // loading the properties of the 
															 // "application.properties" file
		// TODO use the properties loaded in the config
		this.databaseURL = config.getPropertyValue("db.url");
		this.databaseUsername = config.getPropertyValue("db.username");
		this.databasePassword = config.getPropertyValue("db.password");
	}
	
	public void create(Stock stock) {
		try {
			Connection connection = DriverManager.getConnection(this.databaseURL, this.databaseUsername, this.databasePassword);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO STOCK VALUES(?, ?)");
			statement.setString(1, stock.getTicker());
			statement.setInt(2, stock.getQuantity());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

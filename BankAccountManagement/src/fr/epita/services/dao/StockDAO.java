package fr.epita.services.dao;

import fr.epita.datamodel.Stock;
import fr.epita.services.Configuration;

public class StockDAO {

	public StockDAO() {
		Configuration config = Configuration.getInstance();  // loading the properties of the 
															 // "application.properties" file
		// TODO use the properties loaded in the config
	}
	
	public void create(Stock stock) {
		// TODO method to create new Stock in database
		// 4 steps : connection, sql statement, parameter fill, execution
	}
	
}

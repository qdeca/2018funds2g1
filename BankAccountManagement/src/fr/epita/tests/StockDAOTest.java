package fr.epita.tests;

import fr.epita.datamodel.Stock;
import fr.epita.services.dao.StockDAO;

public class StockDAOTest {

	public static void main(String[] args) {
		StockDAO dao = new StockDAO();
		Stock stock = new Stock();
		stock.setTicker("test");
		stock.setQuantity(5);
		dao.create(stock);
	}
	
	
}

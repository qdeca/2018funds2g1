package fr.epita.tests;



import fr.epita.datamodel.Customer;
import fr.epita.services.dao.CustomerDAO;

public class DAOTest {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAO();
		Customer customer = new Customer();
		customer.setName("Thomas Edison");
		customer.setAddress("1, avenue des champs élysées");
		dao.create(customer);
	}
}

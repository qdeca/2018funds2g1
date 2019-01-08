package fr.epita.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import fr.epita.services.Configuration;

public class ConfigFileTest {

	public static void main(String[] args) {
			Configuration config = Configuration.getInstance();
			String username = config.getPropertyValue("db.username");
			String password = config.getPropertyValue("db.password");
			String url = config.getPropertyValue("db.url");
			System.out.println(username);
			System.out.println(password);
			System.out.println(url);

		}
	
}

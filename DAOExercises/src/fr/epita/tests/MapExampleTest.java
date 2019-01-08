package fr.epita.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExampleTest {
	
	public static void main(String[] args) {
		Map<String, Integer> fruitsNumber = new HashMap<String, Integer>();
		fruitsNumber.put("Apples", 3);
		fruitsNumber.put("Oranges", 6);
		for (Entry<String, Integer> entry : fruitsNumber.entrySet()) {
			System.out.println("I have " + entry.getValue() + " " + entry.getKey());
		}
	}

}

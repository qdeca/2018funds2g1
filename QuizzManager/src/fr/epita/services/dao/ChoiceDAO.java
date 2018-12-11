package fr.epita.services.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import fr.epita.datamodel.Choice;

public class ChoiceDAO {

	
	private static final String CHOICES_DB = "choices.db";
	private PrintWriter writer;
	
	
	
	public ChoiceDAO() {
		try {
			writer = new PrintWriter(CHOICES_DB);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void create(Choice choice) {
		writer.write("-----------------");
		writer.write("\n");
		writer.write(choice.getId());
		writer.write("\n");
		writer.write(choice.getLabel());
		writer.write("\n");
		writer.write(choice.getQuestion().getId());
		writer.write("\n");
		writer.write(choice.isValid() ? "true" : "false");
		writer.write("\n");
		writer.write("-----------------");
		writer.write("\n");
		writer.flush();
		
	}
	
	public Choice read(int id) {
		
	}
}

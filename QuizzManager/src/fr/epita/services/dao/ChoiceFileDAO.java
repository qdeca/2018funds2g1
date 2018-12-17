package fr.epita.services.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import fr.epita.datamodel.Choice;
import fr.epita.datamodel.MCQChoice;

public class ChoiceFileDAO {

	
	private static final String CHOICES_DB = "choices.db";
	private PrintWriter writer;
	
	
	
	public ChoiceFileDAO() {
		try {
			writer = new PrintWriter(CHOICES_DB);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void create(MCQChoice choice) {
		writer.write("-----------------");

		writer.write("\n");
		writer.write(choice.getChoice());
		writer.write("\n");
		writer.write(choice.getQuestion().getQuestion());
		writer.write("\n");
		writer.write(choice.isValid() ? "true" : "false");
		writer.write("\n");
		writer.write("-----------------");
		writer.write("\n");
		writer.flush();
	}
	
	public MCQChoice read(int id) {
		try {
			List<String> fileLines = Files.readAllLines(Paths.get("choices.db"));
			MCQChoice choice = new MCQChoice();
			for (String line : fileLines) {
//				if (line.equals(Integer.toString(id))) {
//					choice.setId(id);
//					int index = fileLines.indexOf(line);
//					choice.setChoice(fileLines.get(index+1));
//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}

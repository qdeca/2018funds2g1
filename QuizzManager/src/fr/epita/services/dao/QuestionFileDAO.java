package fr.epita.services.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import fr.epita.datamodel.Choice;
import fr.epita.datamodel.Question;


public class QuestionFileDAO {

	private static final String QUESTIONS_DB = "questions.db";
	private PrintWriter writer;

	
	
	public QuestionFileDAO() {
		try {
			writer = new PrintWriter(QUESTIONS_DB);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void create(Question question) {
		writer.write("-----------------");
		writer.write("\n");
		writer.write(question.getId());
		writer.write("\n");
		writer.write(question.getLabel());
		writer.write("\n");
		writer.write("-----------------");
		writer.write("\n");
		writer.flush();
	}
	
	public Question read(int id) {
		try {
			List<String> fileLines = Files.readAllLines(Paths.get("questions.db"));
			Question question = new Question();
			for (String line : fileLines) {
				if (line.equals(Integer.toString(id))) {
					question.setId(id);
					int index = fileLines.indexOf(line);
					question.setLabel(fileLines.get(index+1));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}

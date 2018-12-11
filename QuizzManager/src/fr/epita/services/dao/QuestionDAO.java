package fr.epita.services.dao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import fr.epita.datamodel.Question;


public class QuestionDAO {

	private static final String QUESTIONS_DB = "questions.db";
	private PrintWriter writer;

	
	
	public QuestionDAO() {
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
		
	}
}

package fr.epita.services.dao;

import java.util.List;

import fr.epita.datamodel.Question;

public class QuestionDAO {

	public void create(Question question) {
		//TODO insert into question table a new element
	}
	
	public List<Question> readByDifficulty(int difficulty) {
		//TODO get all questions of a given difficulty
	}
	
	public void update(Question question) {
		//TODO update a given question
	}
	
	public void delete(Question question) {
		//TODO delete a given question
	}
}

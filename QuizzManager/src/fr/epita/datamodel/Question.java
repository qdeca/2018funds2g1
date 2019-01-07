package fr.epita.datamodel;

public class Question {

	// CREATE TABLE QUESTION(QUESTION VARCHAR(255) PRIMARY KEY,DIFFICULTY INTEGER(10));

	
	private String question;
	
	private String[] topics;
	
	private int difficulty;



	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getTopics() {
		return topics;
	}

	public void setTopics(String[] topics) {
		this.topics = topics;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	
}

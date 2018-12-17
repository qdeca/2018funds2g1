package fr.epita.datamodel;

public class MCQChoice {

	private MCQQuestion question;
	
	private String choice;
	
	private boolean valid;

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public MCQQuestion getQuestion() {
		return question;
	}

	public void setQuestion(MCQQuestion question) {
		this.question = question;
	}
	
	
	
	
	
}

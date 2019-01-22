package fr.epita.services.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.epita.datamodel.Question;

public class QuestionXMLDAO {

	
	private static final String XML_FILENAME = "questions.xml";

	public List<Question> getAllQuestions() throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fact.newDocumentBuilder();
		Document doc = builder.parse(new File(XML_FILENAME));
		
		List<Question> listQuestions = new ArrayList<>();
		NodeList list = doc.getElementsByTagName("question");
		for (int i=0; i<list.getLength(); i++) {
			Question question = new Question();
			Element questionXML = (Element) list.item(i);
			int order = Integer.valueOf(questionXML.getAttribute("order"));
			String label = questionXML.getElementsByTagName("label").item(0).getTextContent();
			int difficulty = Integer.valueOf(questionXML.getElementsByTagName("difficulty").item(0).getTextContent());
			question.setQuestion(label);
			question.setDifficulty(difficulty);
			// TODO add list of topics to question
			listQuestions.add(question);
		}
		
		return listQuestions;
	}
	
	public void create(Question question) {
		
	}
	
	public void updateLabel(Question question, String newLabel) {
		
	}
	
	public void delete(Question question) {
		
	}
}

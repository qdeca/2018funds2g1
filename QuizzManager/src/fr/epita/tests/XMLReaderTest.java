package fr.epita.tests;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReaderTest {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		
		//parsing file
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fact.newDocumentBuilder(); // create builder to parse the xml file
		Document doc = builder.parse(new File("questions.xml")); // parse xml file with builder and store it in doc object
		
		
		NodeList list = doc.getElementsByTagName("question"); // extract all questions from the xml file
		
		for (int i=0; i<list.getLength(); i++) { // loop on all questions
			Element el  = (Element) list.item(i);  // extract the "question" element
			String order = el.getAttribute("order"); // get the "order" attribute
			System.out.println(order);	// print
			NodeList label = el.getElementsByTagName("label"); 
			System.out.println(label.item(0).getTextContent()); // display the label of the question
		}
		
	}

}

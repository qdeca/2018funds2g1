package fr.epita.tests;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathExpression;
import org.xml.sax.SAXException;

public class XMLReaderTest {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		
		
		//parsing file
		//readAllQuestions();
		testXpath();
	}

	private static void testXpath() throws SAXException, IOException, ParserConfigurationException, XPathExpressionException {
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = fact.newDocumentBuilder(); // create builder to parse the xml file
		Document doc = builder.parse(new File("questions.xml")); // parse xml file with builder and store it in doc object
		
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();
		String elementList = xpath.evaluate("//*", "questions.xml");
		//String elementList = expression.evaluate("questions.xml", XPathConstants.STRING);
		System.out.println(elementList);
		//		for (int i=0; i<elementList.getLength(); i++) {
//			System.out.println(elementList.item(i).getTextContent());
//		}
	}

	private static void readAllQuestions() throws ParserConfigurationException, SAXException, IOException {
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

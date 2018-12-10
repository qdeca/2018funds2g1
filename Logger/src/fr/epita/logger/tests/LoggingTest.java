package fr.epita.logger.tests;

import fr.epita.logger.entity.Logger;

public class LoggingTest {

	
	public static void main(String[] args) {
		Logger log = new Logger("LoggingTest");
		log.error("main : Warning ! An error occurred ! ");
		log.info("main : random info ");
	}
}

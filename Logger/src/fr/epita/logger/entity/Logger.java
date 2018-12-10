package fr.epita.logger.entity;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	private String callingClass;
	private PrintWriter writer;
	private boolean init = false;

	
	
	
	public Logger(String callingClass) { // TODO GENERICITY
		this.callingClass = callingClass;
	}

	private boolean initialize() {
		try {
			writer = new PrintWriter("message.log"); // file creation / retrieval
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void log(String message, LoggerLevel severity) {
		while (init == false) { // if logger not initialized
			init = initialize();
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		writer.write(df.format(new Date()) + " " + this.callingClass + " " + severity.toString() + " : " + message); // write text in our file
		writer.close();
	}

	public void debug(String message) {
		log(message, LoggerLevel.DEBUG);
	}

	public void info(String message) {
		log(message, LoggerLevel.INFO);
	}

	public void warn(String message) {
		log(message, LoggerLevel.WARN);
	}

	public void error(String message) {
		log(message, LoggerLevel.ERROR);
	}

	public void fatal(String message) {
		log(message, LoggerLevel.FATAL);
	}

}
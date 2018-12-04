package com.qde.exercises;

import java.util.Date;

public class Logger {
	
	private String currentClass;
	
		public Logger(String currentClass) {

		this.currentClass = currentClass;
	}

	public void debug(String message) {
		log(message, "DEBUG");	}
	
	public void info(String message) {
		log(message, "INFO");	}
	
	public void warn(String message) {
		log(message, "WARN");	}
	
	public void error(String message) {
		log(message, "ERROR");	
		}
	
	public void fatal(String message) {
		log(message, "FATAL");
	}

	private void log(String message, String logType) {
		System.out.println(new Date() + " -- "+ this.currentClass + " -- " + logType + " -- " + message);
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
}

package fr.epita.logger.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

public class Logger {

	private PrintWriter writer;
	private boolean init = false;

	private boolean initialize() {
		try {
			writer = new PrintWriter("message.log"); // file creation / retrieval
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void message() {
		while (!init) { // if logger not initialized
			init = initialize();
		}
		writer.write("test2"); // write text in our file
		writer.close();
	}

	public void debug(String message) {
		// ?
	}

	public void info(String message) {
		// ?
	}

	public void warn(String message) {
		// ?
	}

	public void error(String message) {
		// ?
	}

	public void fatal(String message) {
		// ?
	}

}
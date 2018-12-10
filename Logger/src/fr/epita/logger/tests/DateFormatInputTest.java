package fr.epita.logger.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fr.epita.logger.entity.Logger;

public class DateFormatInputTest {

	
	public static void main(String[] args) {
		// try
		// catch Exception
		try {
			Logger log = new Logger("DateFormatInputTest");
			Scanner scanner = new Scanner(System.in);  //scanner for the input saving
			String dateFormat = scanner.nextLine(); // input date format
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);  // creating date format from the input string
			log.info("The selected date format gives us this date :" + sdf.format(new Date()));
			
		} catch (IllegalArgumentException e) {
			System.out.println("The date format you typed was wrong : " + e.getMessage()); 
		}
		
	}
	
	
	
}

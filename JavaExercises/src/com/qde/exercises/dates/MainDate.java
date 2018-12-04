package com.qde.exercises.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(df.format(date));
	}
}

package com.qde.exercises;

public class Factorial {

	
	public static int factorialFirstWay(int number) {
		int result = 1;
		for (int i=1; i<=number; i++) {
			result = result * i;
		}
		return result;
	}
	public static int factorialSecondWay(int number) {
		int result = 1;
		while(number > 0) {
			result = result * number;
			number--;
		}
		return result;
	}
	public static int factorialThirdWay(int number) {
		int result = 1;
		do {
			result = result * number;
			number--;
		} while (number > 0);
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println("5! with the first way equals : " + Factorial.factorialFirstWay(5));
		System.out.println("4! with the second way equals : " + Factorial.factorialSecondWay(0));
		System.out.println("6! with the third way equals : " + Factorial.factorialThirdWay(0));
	}
}

package com.qde.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.qde.exercises.geometry.Circle;

public class JavaSyntaxDemo {
	private String demoVersion = "1.0_DEV";

	public JavaSyntaxDemo() {

	}

	public JavaSyntaxDemo(String demoVersion) {
		this.demoVersion = demoVersion;
	}

	public String getDemoVersion() {
		return this.demoVersion;
	}

	public void setDemoVersion(String demoVersion) {
		this.demoVersion = demoVersion;
	}

	public static void main(String[] args) {

//    	Scanner scanner = new Scanner(System.in);
//    	try { //this is a try-catch block, we will discuss it further
//           	System.out.println("Please enter your balance : ");
//
//    		int balance = scanner.nextInt();
		Customer customer1 = new Customer();
//        	SavingsAccount account = new SavingsAccount();
//        	customer1.setName("John Smith");
//        	customer1.setAddress("a random street");
//        	Customer customer2 = new Customer("Mary Smith", "11 first street");
//        	
//        	if (balance > 200) {
//        		System.out.println("You are rich !");
//        	} else {
//        		System.out.println("Too bad");
//        	}
//        	
//        	//test
//        	// alternative to if...then...else
//        	switch(balance) {
//        	case 200 : System.out.println("you have 200 €");
//        				break;
//        	case 500 : System.out.println("you have 500 €");
//			break;
//        	default : System.out.println("value different from 200 and 500");
//			break;
//        	}
//        	
//        	account.setInterestRate(2);
//        	account.setBalance(balance);
//           	System.out.println("The balance before withdrawal is : " + account.getBalance());
//            account.withdraw(50);
//        	System.out.println("The balance after withdrawal is : " + account.getBalance());
//        	 
//           	System.out.println("The balance before computing interest is : " + account.getBalance());
//               	
//        	double newInterest = account.computeInterest();
//           	System.out.println("The balance after computing interest is : " + newInterest);
//
//    	} catch (InputMismatchException e) {
//    	    System.out.println("Invalid Entry");
//    	}

//    	Circle bigCircle = new Circle(60);
//        Circle smallCircle = new Circle();
//        smallCircle.setRadius(20);
//        
//        System.out.println("big circle radius :" + bigCircle.getRadius());
//        System.out.println("small circle radius :" + smallCircle.getRadius());

		String goodLogin = "admin";
		String goodPassword = "password";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your login");
		String userLoginInput = scanner.nextLine();
		System.out.println("Please enter your password");
		String userPasswordInput = scanner.nextLine();
		if (goodLogin.equals(userLoginInput) && goodPassword.equals(userPasswordInput)) {
			System.out.println("You are authenticated");
			System.out.println("Please choose an option between Create, Modify and Delete : ");
			boolean exit = false;
			do {	// navigation in the menu ...
				
				String userMenuInput = scanner.nextLine();
				switch (userMenuInput) {
				case "Create":
					System.out.println("Welcome to the Create page");
					break;
				case "Modify":
					System.out.println("Welcome to the Modify page");
					break;
				case "Delete":
					System.out.println("Welcome to the Delete page");
					break;
				case "Quit":	// if the string is Quit or Exit the boolean is set to true
				case "Exit":
					exit = true;
					System.out.println("Goodbye !");
					break;
				default:
					System.out.println("Wrong input");
				}
			} while (!exit);	// ...as long as the exit boolean is false

		} else {
			System.out.println("Wrong login");
		}
		scanner.close();

	}
}

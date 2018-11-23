package com.qde.exercises;

public class SavingsAccount extends Account{
	private double interestRate;
	

	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double computeInterest() {
		return (this.getBalance() * this.interestRate);
	}
	
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}
}

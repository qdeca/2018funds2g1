package com.qde.exercises.geometry;

public class Quadrilateral {

	private double sideA;
	private double sideB;
	private double sideC;
	private double sideD;
	
	
	
	
	
	public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.sideD = sideD;
	}


	public double getPerimeter() {
		return this.sideA + this.sideB + this.sideC + this.sideD;
	}
	

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getSideD() {
		return sideD;
	}

	public void setSideD(double sideD) {
		this.sideD = sideD;
	}
}

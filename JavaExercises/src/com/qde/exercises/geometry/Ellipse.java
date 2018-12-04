package com.qde.exercises.geometry;

public class Ellipse {

	private double littleRadius;
	
	private double bigRadius;

	public Ellipse(double littleRadius, double bigRadius) {
		this.littleRadius = littleRadius;
		this.bigRadius = bigRadius;
	}

	public double getLittleRadius() {
		return littleRadius;
	}

	public void setLittleRadius(double littleRadius) {
		this.littleRadius = littleRadius;
	}

	public double getBigRadius() {
		return bigRadius;
	}

	public void setBigRadius(double bigRadius) {
		this.bigRadius = bigRadius;
	}
	
	public final double getPerimeter() {
		double perimeter  = 2 * Math.PI * Math.sqrt((this.littleRadius*this.littleRadius + this.bigRadius*this.bigRadius)/2);
		return perimeter;
	}

	
	
}

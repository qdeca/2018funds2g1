package com.qde.exercises.geometry;

public class Circle extends Ellipse implements Shape{
	
	
	private double radius;
	
	public Circle(double radius) {
		super(radius, radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

}

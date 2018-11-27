package com.qde.exercises.geometry;

public class Quadrilateral {

	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getPerimeter() {
		return 2 * this.getHeight() + 2 * this.getWidth();
	}
	
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}
	
	
}

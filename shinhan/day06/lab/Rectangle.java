package com.shinhan.day06.lab;

public class Rectangle extends Shape{

	double length;
	double width;
	
	public Rectangle(String color, int length, int width) {
		super(color, "Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return width * length;
	}
	
	public double calculatePerimeter() {
		return 2 * (width + length);
	}

}

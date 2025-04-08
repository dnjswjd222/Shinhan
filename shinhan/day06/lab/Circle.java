package com.shinhan.day06.lab;

public class Circle extends Shape{
	double radius;
	double circumference;
	
	public Circle(String color, double radius) {
		super(color, "Circle");
		this.radius = radius;
	}
	
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	public double calculatePerimeter() {
		circumference = radius * 2 * Math.PI;
		return circumference;
	}
	
	public double getRadius() {
		return radius;
	}	
}

package com.shinhan.day07.inter.lab4;

public class RectTriangle extends Shape{

	double width;
	double height;
	
	RectTriangle(double w, double h){
		super(3);
		this.width = w;
		this.height = h;
	}
	
	@Override
	double getArea() {
		return width*height/2.0;
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(width*width + height*height);
	}

}

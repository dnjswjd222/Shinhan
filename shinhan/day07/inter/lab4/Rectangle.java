package com.shinhan.day07.inter.lab4;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	
	Rectangle(double w, double h){
		super(4);
		this.width = w;
		this.height = h;
	}
	
	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (width+height) * 2;
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

}

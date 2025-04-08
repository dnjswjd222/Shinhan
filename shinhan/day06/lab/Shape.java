package com.shinhan.day06.lab;

//abstract class: 추상메서드를 담고있다.
//abstract method: 정의는 있고(함수선언부) 구현({})은 없다. 구현은 자식이 한다.
//직접 객체생성 불가 즉, new Shape();
public class Shape {

	private String color;
	private String type;

	public Shape() {
	}

	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public double calculateArea() {
		return 0;
	}

	public double calculatePerimeter() {
		return 0;
	}

	public String toString() {
		return color + " " + type;
	}

}

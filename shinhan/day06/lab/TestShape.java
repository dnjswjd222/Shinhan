package com.shinhan.day06.lab;

public class TestShape {

	public static void main(String args[]) {
		Shape[] s = new Shape[3];

		s[0] = new Circle("BLUE", 10);
		s[1] = new Rectangle("RED", 5, 7);
		s[2] = new Circle("GREEN", 8);

		for (int i = 0; i < 3; i++) {
//			if (s[i] instanceof Circle) {
//				System.out.println(
//						"Shape " + i + " is a " + s[i] + " with an area of " + s[i].calculateArea() + ", a radius of "
//								+ ((Circle) s[i]).getRadius() + ", and a perimeter of " + s[i].calculatePerimeter());
//			} else if (s[i] instanceof Rectangle) {
//				System.out.println("Shape " + i + " is a " + s[i] + " with an area of " + s[i].calculateArea()
//						+ " and a perimeter of " + s[i].calculatePerimeter());
			System.out.println(i + "번째 도형" + s[i]);
			System.out.println(i + "번째 도형 면적: " + s[i].calculateArea());
			System.out.println(i + "번째 도형 둘레: " + s[i].calculatePerimeter());
			if(s[i] instanceof Circle) {
				Circle c = (Circle)s[i];
				System.out.println(i + "번째 도형 반지름: " + c.getRadius());
			}
		}
	}
}

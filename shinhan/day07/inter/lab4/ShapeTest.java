package com.shinhan.day07.inter.lab4;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		shape[0] = new Rectangle(5,6);
		shape[1] = new RectTriangle(6,2);
		
		for(Shape sh:shape) {
			System.out.println("area: " + sh.getArea());
			System.out.println("perimeter: " + sh.getPerimeter());
			if(sh instanceof Rectangle rectangle) {
				rectangle.resize(0.5);
				System.out.println("new area: " + rectangle.getArea());
				System.out.println("new perimeter: " + rectangle.getPerimeter());
			}
		}
	}

}

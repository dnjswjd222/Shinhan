package com.shinhan.day04.ch6;

public class CarTest {

	public static void main(String[] args) {
		Car[] c = new Car[4];
		
		c[0] = new Car();
		c[1] = new Car("아우디");
		c[2] = new Car("제네시스", "검은색");
		c[3] = new Car("페라리", "노란색", 180);
		
		System.out.println(Car.carCount);
		for (Car car:c) {
			car.display();
		}
	}

}

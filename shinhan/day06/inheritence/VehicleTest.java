package com.shinhan.day06.inheritence;

public class VehicleTest {

	public static void main(String[] args) {
		Car c = new Car("승용차", 180, 15);
		Bus b = new Bus("시내버스", 100, 40);
		Truck t = new Truck("화물트럭", 90, 5000);
		
		c.info();
		System.out.println("------------");
		b.info();
		System.out.println("------------");
		t.info();
		System.out.println("------------");
	}

}

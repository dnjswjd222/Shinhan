package com.shinhan.day06.inheritence;

public class Truck extends Vehicle {
	int maxLoad;

	Truck(String name, int speed, int maxLoad){
		super(name, speed);
		this.maxLoad = maxLoad;
	}

	public void info() {
		super.info();
		System.out.println("최대적재량: " + maxLoad + "kg");
	}
}

package com.shinhan.day06.inheritence;

public class Bus extends Vehicle {
	int passengerCount;

	Bus(String name, int speed, int passengerCount){
		super(name, speed);
		this.passengerCount = passengerCount;
	}

	public void info() {
		super.info();
		System.out.println("승객 수용 가능 인원: " + passengerCount + "명");
	}
	
	public void info2() {
		System.out.println("버스!!!!");
	}
}

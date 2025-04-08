package com.shinhan.day06.inheritence;

//final class는 상속 불가
//final field는 수정 불가
//final method는 재정의 불가
public class Vehicle {
	private String name;
	private int speed;
	
	protected Vehicle(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	
	protected void start() {
		System.out.println(name + " 출발합니다. (속도: " + speed + "km/h)");		
	}
	
	protected void stop() {
		System.out.println(name + " 멈춥니다.");
	}

	public void info() {
		System.out.println("차량명: " + name + ", 최고속도: " + speed + "km/h");
	}
}

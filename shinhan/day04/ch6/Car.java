package com.shinhan.day04.ch6;

public class Car {
	String model;
	String color;
	int maxSpeed;
	
	//C언어의 share변수, 자바는 static변수
	//class를 이용해서 생성한 모든 instance(멤버)가 공유한다.
	static int carCount;
	Car(){
		this(null, null, 0);
	}
	Car(String model){
		this(model, null, 0);
	}
	Car(String model, String color){
		this(model, color, 0);
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("자동차가 생성되었습니다.");
		carCount++;
	}
	
	void display() {
		System.out.println("차량 모델: " + model);
		System.out.println("차량 색깔: " + color);
		System.out.println("최고 속도: " + maxSpeed);
		System.out.println("-------------");
	}
}

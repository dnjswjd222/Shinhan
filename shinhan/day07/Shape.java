package com.shinhan.day07;

//abstract class: 추상메소드가 있다.
public abstract class Shape {
	
	//부모를 통해 자식의 기능을 이용하기 위해 정의
	//자식이 재정의하면 재정의된 메소드가 수행된다.
	//abstract: 정의는 있고 구현은 없다(추상 메소드)
	public abstract double getArea();
}

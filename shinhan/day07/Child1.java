package com.shinhan.day07;

public class Child1 extends Parent{
	
	//부모의 field이름과 동일하면 자식것이 우선
	boolean score;
	
	//1.field 추가
	String myName;
	
	//2.생성자를 추가
	public Child1(int score, String myName) {
		super(score);
		this.myName = myName;
	}
	
	public Child1() {
		//super()...부모의 생성자를 호출한다.(생략가능), 첫줄에만 가능
		super(0);
		System.out.println("자식1 default 생성자");
	}
	
	//3.method 추가
	void display() {
		System.out.println("scroe = " + score);
		System.out.println("myName = " + myName);
	}
	
	//4.method 수정(override, 덮어쓰기): 이름, 매개변수, return 같고 Modifier는 같거나 넓어져야한다.
	void info() {
		//System.out.println("자식의 info메서드이다. score = " + score);
		super.info();
		System.out.println("자식의 info메서드이다. myName = " + myName);
		System.out.println("-------------------------------------");
	}
}

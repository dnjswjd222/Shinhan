package com.shinhan.day07.inter;

//TV interface를 구현한 class이다.
public class LgTV implements TV{

	String company2 = "LG전자";
	
	void display() {
		System.out.println("우리회사는 화질이 좋아요");
	}
	
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "전원켠다!!!");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "전원끈다!!!");
	}

	@Override
	public void show() {
		System.out.println(getClass().getSimpleName() + "show!!!");
	}

	@Override
	public void active() {
		TV.super.active();
		System.out.println("===LG가 재정의함===");
	}
	
	//오버라이드가 아니라 새로운 메소드 정의
	static void staticMethod() {
		System.out.println("구현class가 재정의 불가...추가메소드");
	}
}

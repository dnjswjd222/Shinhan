package com.shinhan.day07.inter;

//interface : 규격서, 상수 + 추상메소드들의 묶음
public interface TV {
	//1.상수, public static final 생략 가능
	int SBS = 6;
	public static final int KBS = 9;
	
	//2.추상메소드들, public abstract 생략 가능
	void powerOn();
	public abstract void powerOff();
	public abstract void show();
	
	//3.default method: 구현 class가 공통적으로 사용가능한 기능, 재정의 가능한 메소드
	default void active() {
		System.out.println("interface의 default 메소드 active()");
	}
	
	//4.static method: 구현 class가 재정의 불가능
	static void staticMethod() {
		System.out.println("interface의 static 메소드...구현class가 재정의불가");
	}
	
	//5.private method: 3(일반 메소드)번 같은 곳에 모듈화하여 사용하기 위한 메소드
	private void privateMethod() {
		System.out.println("interface의 내부에서만 사용되는 private메소드");
	}
	
	//6.private static method: 4(static 메소드)번에 사용하기 위한 메소드
	private static void privateStaticMethod() {
		System.out.println("interface의 내부에서만 static 사용되는 메소드");
	}
}

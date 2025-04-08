package com.shinhan.day06;

//Modifier: 접근권한 활용방법
//활용방법: static, final, ....
/*
 * 
 * =======(class, field, constructor, method)=======
 * 접근 권한은 4가지가 있다.
 * public: 모든 패키지에서 접근가능
 * protected: 같은 패키지이면 접근가능, 다른 패키지이면 상속받은 경우 접근가능
 * 생략(default): 같은 패키지에서 접근가능
 * private: 자신의 class에서만 접근가능
 */
public class Computer {
	public static int a;
	public static int b;
	public static final int C=100;

	public String os;
	public int price;

	public Computer() {

	}

	public Computer(String os, int price) {
		this.os = os;
		this.price = price;
	}

	public void print2() {
		System.out.println(os);
		System.out.println(price);
	}
	public void print3() {
		System.out.println(os);
		System.out.println(price);
	}	
	private	void print4() {
		System.out.println(os);
		System.out.println(price);
	}
}

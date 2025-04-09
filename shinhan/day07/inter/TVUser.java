package com.shinhan.day07.inter;

public class TVUser {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		//interface 타입 = 구현 class
		TV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.active();
		TV.staticMethod();;
		
		if (tv instanceof SamsungTV sam) {
			sam.samsungInfo();
			sam.sound();
		}
		if (tv instanceof LgTV lg) {
			lg.display();
			lg.staticMethod();
		}
	}
}

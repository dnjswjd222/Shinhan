package com.shinhan.day10.thread;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread3 t1 = new PrintThread3();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
	}
	
	public static void main2(String[] args) {
		PrintThread2 t1 = new PrintThread2();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.setStop(true);
	}
}

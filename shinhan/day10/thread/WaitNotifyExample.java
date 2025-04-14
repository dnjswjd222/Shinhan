package com.shinhan.day10.thread;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workobject = new WorkObject();
		
		ThreadA t1 = new ThreadA(workobject);
		ThreadB t2 = new ThreadB(workobject);
		
		t1.start();
		t2.start();
	}
}

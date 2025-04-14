package com.shinhan.day10.thread;

public class ThreadA extends Thread{
	private WorkObject workobject;
	
	ThreadA(WorkObject workobject){
		this.workobject = workobject;
		setName("쓰레드 A");
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodA();
		}
	}
}

package com.shinhan.day10.thread;

public class ThreadB extends Thread{
	private WorkObject workobject;
	
	ThreadB(WorkObject workobject){
		this.workobject = workobject;
		setName("쓰레드 B");
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodB();
		}
	}
}

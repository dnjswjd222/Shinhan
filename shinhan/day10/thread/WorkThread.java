package com.shinhan.day10.thread;

public class WorkThread extends Thread{
	boolean work = true;
	
	WorkThread(String name){
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업처리");
			}else {
				Thread.yield();
			}
		}
	}
}

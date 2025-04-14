package com.shinhan.day10.thread;

import lombok.Getter;

@Getter
public class Calculator {
	int memory;
	
	//동기화메서드(lock걸기)
	synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}

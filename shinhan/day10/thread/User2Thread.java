package com.shinhan.day10.thread;


public class User2Thread extends Thread {
	Calculator calculator;
	
	User2Thread(String name, Calculator cal){
		setName(name);
		this.calculator = cal;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}

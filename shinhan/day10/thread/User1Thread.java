package com.shinhan.day10.thread;


public class User1Thread extends Thread {
	Calculator calculator;
	
	User1Thread(String name, Calculator cal){
		setName(name);
		this.calculator = cal;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}

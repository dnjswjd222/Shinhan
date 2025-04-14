package com.shinhan.day10.thread;

//멀티thread 가능
public class UppercaseThread extends Thread{

	//run메소드 구현하면 다중 흐름을 가질 수 있다.
	//run()메소드 재정의해야한다.
	@Override
	public void run() {
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("[" + currentThread().getName() + "]" + ch);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.shinhan.day10.thread;

class Parent {

}


//Runnable 인터페이스 구현하면 멀티쓰레드 가능
public class NumberRunnableClass extends Parent implements Runnable {

	@Override
	public void run() {
		for (int ch = 1; ch <= 26; ch++) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

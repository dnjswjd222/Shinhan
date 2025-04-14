package com.shinhan.day10.thread;

//thread: 프로그램의 실행 흐름
//단일thread...기본
//멀티thread
public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("main 시작 thread 이름: " + Thread.currentThread().getName());
		
		//A~Z 출력
		//a~z 출력
		//0~26 출력
		UppercaseThread t1 = new UppercaseThread();
		LowercaseThread t2 = new LowercaseThread();
		NumberRunnableClass r1 = new NumberRunnableClass();
		Thread t3 = new Thread(r1);
		
		//익명 구현 class만들고 즉시 실행해보기
		(new Thread() {
			public void run() {
				String[] arr = {"자바", "웹", "프레임워크", "자바스크립트", "파이썬"};
				for(String subject:arr) {
					System.out.println("[" + currentThread().getName() + "]" + subject);
				}
			}
		}).start();
		
		//Runnable interface 익명구현class
		Thread t5 = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] arr = {"자바", "웹", "프레임워크", "자바스크립트", "파이썬"};
				for(String subject:arr) {
					System.out.println("[" + Thread.currentThread().getName() + "]" + subject);
				}
			}
		});
		
		Thread t6 = new Thread(() ->{
			String[] arr = {"자바", "웹", "프레임워크", "자바스크립트", "파이썬"};
			for(String subject:arr) {
				System.out.println("[" + Thread.currentThread().getName() + "]" + subject);
			}
		});
				
		
		t5.start();	
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main 끝");
	}
}

package com.shinhan.day11;

//프로그램 실행(실행중인 프로그램): process
//흐름(thread): 1개(Single Thread)
//흐름(thread): 여러개(Multi Thread)...Thread상속, Runnable구현
public class Review {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "시작");
		MyThread1 t1 = new MyThread1();
		Runnable r1 = new MyThread2();
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		System.out.println(Thread.currentThread().getName() + "끝");
	}
}
//Thread 상속
class MyThread1 extends Thread{
	public void run() {
		System.out.println(currentThread().getName() + " 스레드1");
	}
}
//Runnable 구현
class MyThread2 extends Object implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 스레드2");
	}
}

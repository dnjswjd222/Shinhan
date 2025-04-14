package com.shinhan.day10.thread;

public class ThreadTest2 {
	public static void main(String[] args) {
		call2();
	}

	private static void call2() {
		BathRoom room = new BathRoom();
		
		BathThread t1 = new BathThread("김", room);
		BathThread t2 = new BathThread("박", room);
		BathThread t3 = new BathThread("양", room);
		
		t1.start();
		t2.start();
		t3.start();
	}

	private static void call() {
		Account sung = new Account("123", "성춘향", 1000);
		Account lee = new Account("124", "이몽룡", 2000);
		
		ShareArea shareArea = new ShareArea(sung, lee);
		
		PrintThread t1 = new PrintThread(shareArea);
		TransferThread t2 = new TransferThread(shareArea);
		t1.start();
		t2.start();
	}
}

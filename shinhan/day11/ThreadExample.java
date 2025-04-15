package com.shinhan.day11;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		thread.interrupt(); // 쓰레드에서 일시정지 상태를 만듬 -> sleep(1)
							// Exception 처리
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			if(isInterrupted()) break;
		}
	}
}
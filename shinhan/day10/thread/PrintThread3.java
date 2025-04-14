package com.shinhan.day10.thread;

import lombok.Setter;

@Setter
public class PrintThread3 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("PrintThread3 실행중");
				sleep(1);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("안정적으로 자원을 정리(파일 닫기, 네트워크 연결 끊기)");
		System.out.println("PrintThread2 정상 종료");
	}
}

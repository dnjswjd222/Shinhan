package com.shinhan.day10.thread;

import lombok.Setter;

@Setter
public class PrintThread2 extends Thread{
	boolean stop;
	
	public void run() {
		while(!stop) {
			System.out.println("PrintThread2 실행중");
		}
		System.out.println("안정적으로 자원을 정리(파일 닫기, 네트워크 연결 끊기)");
		System.out.println("PrintThread2 정상 종료");
	}
}

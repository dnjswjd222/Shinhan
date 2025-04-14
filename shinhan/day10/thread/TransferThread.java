package com.shinhan.day10.thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TransferThread extends Thread{

	ShareArea shareArea;
	
	@Override
	public void run() {
		//12번 sung -> lee 100만원씩 이체
		for (int i=1; i<=12; i++) {
			//2.동기화함수이용
			shareArea.transfer();
			
			//동기화 가능
			//1.동기화 block 이용
//			synchronized (shareArea) {
//				int amount = shareArea.getLee().withdraw(100);
//				System.out.println("[출금(lee -> sung)]" + amount);
//				shareArea.getSung().deposit(amount);
//				System.out.println("[입금]" + amount);
//				System.out.println("---------------------------");
//			}
		}
	}
	
}

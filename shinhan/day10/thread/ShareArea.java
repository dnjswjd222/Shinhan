package com.shinhan.day10.thread;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShareArea {
	private Account sung;
	private Account lee;
	
	//이 함수를 점유하고 있는 Thread가 있다면 다른 Thread는 진입하지않고 기다린다.
	//실행중인 Thread가 lock을 건다.
	public synchronized void print() {
		System.out.println("[잔액합계]" + 
				(sung.getBalance()+lee.getBalance()));
	}
		
	public synchronized void transfer() {
		int amount = lee.withdraw(100);
		System.out.println("[출금(lee -> sung)]" + amount);
		sung.deposit(amount);
		System.out.println("[입금]" + amount);
		System.out.println("---------------------------");
	}
}

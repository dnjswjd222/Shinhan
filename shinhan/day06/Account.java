package com.shinhan.day06;

public class Account {
	private int balance;
	
	//상수는 반드시 선언시 초기화된다.
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public void setBalance(int money) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}

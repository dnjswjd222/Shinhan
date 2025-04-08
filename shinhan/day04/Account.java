package com.shinhan.day04;

public class Account {
	String accNo;
	int balance = 0;
	
	Account(String accNo, int balance){
		this.accNo = accNo;
		this.balance = balance;
		System.out.printf("%s 계좌가 개설되었습니다.\n", accNo);
		getBalance();
	}
	
	void deposit(int amount) {
		getAccNo();
		System.out.printf("계좌에 %d원이 입금되었습니다.\n", amount);
		this.balance += amount;
		getBalance();
	}
	
	void withdraw(int amount) {
		getAccNo();
		System.out.printf("계좌에 %d원이 출금되었습니다.\n", amount);
		this.balance -= amount;
		getBalance();
	}
	
	void getBalance() {
		getAccNo();
		System.out.printf("계좌의 잔고는 %d원입니다.\n", balance);
	}
	
	void getAccNo() {
		System.out.printf("%s ", accNo);
	}
}

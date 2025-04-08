package com.shinhan.day06;

public class Account2 {
	private String num;
	private String name;
	private int money;
	
	public Account2() {
	}
	public Account2(String num, String name, int money){
		this.num = num;
		this.name = name;
		this.money = money;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	void deposit(int money) {
		this.money += money;
	}
	
	void withdraw(int money) {
		if(this.money >= money) {
			this.money -= money;
			System.out.println("출금이 성공했습니다.");
		}else
			System.out.println("출금이 실패하였습니다.");
	}
	
	@Override
	public String toString() {
		return  num + "  " + name + "  " + money;
	}
	
	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
}

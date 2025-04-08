package com.shinhan.day06;

import java.util.Scanner;

public class BankApplication {
	Account2[] acc = new Account2[100];
	Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {	
		BankApplication app = new BankApplication();
		boolean isTrue = true;
		int choice = 0;
		int index = 0;
		
		while (isTrue) {
			print();
			choice = app.in.nextInt();
			switch (choice) {
			case 1 -> {
				print2(choice);
				f_makeAccount(app);
			}
			case 2 -> {
				print2(choice);
				f_list(app);
			}
			case 3 -> {
				print2(choice);
				f_deposit(app);
			}
			case 4 -> {
				print2(choice);
				f_withdraw(app);
			}
			case 5 -> {
				isTrue = false;
			}
			default -> {}
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void f_withdraw(BankApplication app) {
		System.out.print("계좌번호: ");
		String num = app.in.next();
		System.out.print("출금액: ");
		int money = app.in.nextInt();
		for (int i = 0; i < app.acc.length; i++) {
			if(app.acc[i] == null) break;
			if(!app.acc[i].getNum().equals(num)) continue;
			app.acc[i].withdraw(money);
			break;
		}
	}

	private static void f_deposit(BankApplication app) {
		System.out.print("계좌번호: ");
		String num = app.in.next();
		System.out.print("예금액: ");
		int money = app.in.nextInt();
		for (int i = 0; i < app.acc.length; i++) {
			if(app.acc[i] == null) break;
			if(!app.acc[i].getNum().equals(num)) continue;
			app.acc[i].deposit(money);
			break;
		}
	}

	private static void f_list(BankApplication app) {
		for(Account2 acc:app.acc) {
			if(acc == null) {
				break;
			}
			System.out.println(acc);
		}
	}

	private static void f_makeAccount(BankApplication app) {
		System.out.print("계좌번호: ");
		String num = app.in.next();
		System.out.print("계좌주: ");
		String name = app.in.next();
		System.out.print("초기입금액: ");
		int money = app.in.nextInt();
		Account2 acc = new Account2(num, name, money);
		for(int i=0; i<app.acc.length; i++) {
			if(app.acc[i] == null) {
				app.acc[i] = acc; break;
			}
		}
	}

	private static void print() {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택> ");
	}

	private static void print2(int num) {
		System.out.println("--------");
		switch (num) {
		case 1 -> {
			System.out.println("계좌생성");
		}
		case 2 -> {
			System.out.println("계좌목록");
		}
		case 3 -> {
			System.out.println("예금");
		}
		case 4 -> {
			System.out.println("출금");
		}
		case 5 -> {
			System.out.println("종료");
		}
		}
		System.out.println("--------");
	}
}

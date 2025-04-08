package com.shinhan.day02;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		f7();
	}
	
	private static void f7() {
		int balance = 0;
		boolean isEnd = false;
		int job;
		Scanner in = new Scanner(System.in);
		while(!isEnd) {
			menuDisplay();
			job = in.nextInt();
			switch(job) {
			case 1->{
				System.out.print("입금>>");
				int amount = in.nextInt();
				balance += amount;
			}
			case 2->{
				System.out.print("출금>>");
				int amount2 = in.nextInt();
				if(balance < amount2) {
					System.out.println("잔고부족, 출금불가"); continue;
				}
				balance -= amount2;
			}
			case 3->{
				System.out.println("잔고>>" + balance);
			}
			case 4->{isEnd = true;
			}
			default->{
				System.out.println("지원되지 않는 업무입니다.");
			}
			}
		}
		System.out.println("-----------종료----------");
	}

	private static void menuDisplay() {
		System.out.println("-----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("-----------------------");
		System.out.print("작업선택>>");
	}

	private static void f6() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for (int z=1; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void f5() {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void f4() {
		int x;
		int y;
		for (x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}
	}

	private static void f3() {
		//로또번호생성
		int aa = (int)(Math.random()*45) + 1;
		System.out.println(aa);
	}

	private static void f2() {
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1; //1 <= 정수 <= 6
			int dice2 = (int)(Math.random()*6) + 1;
			if(dice1 + dice2 == 5) {
				System.out.printf("(%d,%d)", dice1, dice2);
				break;
			}
		}
	}

	private static void f1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else
				continue;
		}
		System.out.println(sum);
	}

}

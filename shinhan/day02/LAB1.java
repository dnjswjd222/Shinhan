package com.shinhan.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4('%',4,false);
		f5();
	}

	private static void f5() {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void f4(char cell, int size, boolean isRect) {
		if (isRect == true) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.printf("%c", cell);
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= size; i++) {
				for (int j = 0; j < i; j++) {
					System.out.printf("%c", cell);
				}
				System.out.println();
			}
		}
	}

	private static void f3() {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = in.nextInt();
		int sum = 0;

		if (num % 2 != 0) {
			for (int i = 1; i <= num; i += 2)
				sum += i;
		} else {
			for (int i = 2; i <= num; i += 2)
				sum += i;
		}
		System.out.println("결과 값: " + sum);
	}

	private static void f2() {
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String word = in.nextLine();
		
		word = word.toUpperCase();
		for (int i=1; i<=word.length(); i++) {
			for (int j=0; j<i; j++) {
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}

	private static void f1() {
		Scanner in = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요: ");
		int a = in.nextInt();

		System.out.print("마지막 값을 정수로 입력하세요: ");
		int b = in.nextInt();

		System.out.print("증가분을 정수로 입력하세요: ");
		int c = in.nextInt();
		int sum = 0;

		for (; a <= b; a += c) {
			sum += a;
		}

		if (sum >= 1000)
			sum += 2000;
		System.out.printf("총합은 %d 입니다.", sum);
	}
}

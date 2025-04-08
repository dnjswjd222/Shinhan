package com.shinhan.day02;

public class LoopingTest {

	public static void main(String[] args) {
		f8();
	}
	
	//expression 방식
	private static void f8() {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A" -> {
			score1 = 100;
		}
		case "B" -> {
			int result = 100 - 20;
			score1 = result;
		}
		default -> {
			score1 = 60;
		}
		}
		System.out.println(score1);
	}
	
	//statement 방식
	private static void f7() {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
	}


	private static void f6() {
		int data = 10; // double은 불가능
		switch (data) {
		case 10:
			System.out.println("합격");
			break;

		default:
			System.out.println("불합격");
			break;
		}
	}

	private static void f5() {
		// 구구단
		labelA: for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (j == 4)
					break labelA;
				System.out.printf("%d * %d = %d\t", j, i, j * i);
			}
			System.out.println();
		}
	}

	private static void f4() {
		// ;(세미콜론), ;(콜론), ,(콤마), ~(틸드), ^(캐럿)
		for (int i = 1; i <= 10; i++) { // 1~10까지 반복, i<=10조건식이 참인동안 반복한다.
			if (i % 5 == 0)
				continue; // 아래문장들을 무시하고 반복은 계속한다.
			System.out.println("i= " + i);
		}
	}

	private static void f3() {
		int i = 1;
		int sum = 0;
		do {
			System.out.println(i);
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(i);
		System.out.println(sum);
	}

	private static void f2() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println(i);
		System.out.println(sum);
	}

	private static void f1() {
		// for, while, do~while
		int i;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(i);
		System.out.println(sum);
	}

}

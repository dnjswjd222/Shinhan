package com.shinhan.day08.exception;

import java.io.IOException;

public class MyExceptionTest {

	public static void main(String[] args) throws IOException {
		// f1();
		f4();
		System.out.println("===Main END===");
	}

	private static void f4() throws IOException {
		// 일반예외는 Exception해결할 의무가 있다. 해결안하면 컴파일오류이다.
		// 해결방법 1: 떠넘긴다. (나의 함수로 떠넘긴다) throws IOException
		// 해결방법 2: 내가 처리한다.
		int i = System.in.read();
		System.out.println(i);
	}

	// Exception(예외): 예외가 발생하면 프로그램이 중단된다. 예외 처리하면 계속 진행하도록 할 수 있다.
	// 1.RuntimeException: 컴파일시에 오류처리 안한다. 실행시 처리. f1(),f2(),f3()
	private static void f1() {
		try {
			// 예외발생가능성이 있는 문장
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// 예외를 처리함
			System.out.println(e.getMessage());
		}
		System.out.println("=====End=====");
	}

	private static void f3() {
		String score = "100점";

		try {
			int intScore = Integer.parseInt(score);
			System.out.println(intScore + 10);
		} catch (NumberFormatException aa) {
			System.out.println(aa.getMessage());
			aa.printStackTrace();
		}
		System.out.println("===f3 END===");
	}

	private static void f2() {
		int[] arr = null;
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException aa) {
			System.out.println(aa.getMessage());
		} catch (NullPointerException aa) {
			System.out.println(aa.getMessage());
		}
		System.out.println("===f2 END===");
	}
}

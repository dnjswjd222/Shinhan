package com.shinhan.day03;

public class Review {

	public static void main(String[] args) {
		f_review2();
	}

	private static void f_review2() {
		//반복문: for, while, do~while
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}

	private static void f_review() {
		//조건문: 3항연산자이용, if, switch  
		//입력된 숫자가 짝수인가, 홀수인가?
		int su=10;
		String result = su%2==0 ? "짝수" : "홀수";
		String result2;
		if (su%2==0) {
			result2 = "짝수";
		}else {
			result2 = "홀수";
		}
		String result3 = "";
		switch (su%2) {
		case 0: result3 = "짝수"; break;
		case 1: result3 = "홀수"; break;
		}
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}

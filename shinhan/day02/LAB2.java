package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		f8();
	}

	private static void f8() {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("[,\\s]"); //구분자를 ,로 한다.  \\s: 공백, enter, tab도 포함
		//[]선택, []안에 나열된 문자로 구분한다. 기본 구분자는 공백이다.
		System.out.print("숫자를 입력하세요: ");
		int su1 = in.nextInt(); 
		int su2 = in.nextInt();
		//int min = su1>su2?su2:su1; //작은수를 구한다.
		int min = Math.min(su1, su2);
		int result = 1;
		for(int i=min; i>=1; i--) {
			if (su1%i==0 && su2%i==0) {
				result = i; break;
			}
		}
		System.out.println(result);
	}

	private static void f7(int month) {
		if(month<1 || month>12) {
			System.out.printf("%d월은 존재하지 않습니다. 다시 입력하세요",month);
		}else {
			switch(month) {
			case 4,6,9,11 -> {
				System.out.println(30);
			}
			case 1,3,5,7,8,10,12 -> {
				System.out.println(31);
			}
			case 2 -> {
				System.out.println(28);
			}
			}
		}
	}

	private static void f6() {
		Scanner in = new Scanner(System.in);
		System.out.print("년도: ");
		int x = in.nextInt();
		
		if((x%4==0) && (x%100!=0) || (x%400==0)) {
			System.out.printf("%d년 2월의 말일은 29일입니다.",x);
		}else {
			System.out.printf("%d년 2월의 말일은 28일입니다.",x);
		}
	}

	private static void f5() {
		int sum=0;
		int x=1;
		int y=1;
		for (int i=1; i<=15; i++) {
			sum += x;
			x += y;
			y++;
		}
		System.out.println("15번째까지의 합: "+sum);
	}

	private static void f4() {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int x = in.nextInt();
		int sum = 0;
		
		System.out.printf("%d의 배수 개수 = %d", x, 1000/x);
		System.out.println();
		
		for (int i=1; i<=1000/x; i++) {
			sum += i*x;
		}
		System.out.printf("%d의 배수 합 = %d", x, sum);
	}

	private static void f3() {
		Scanner in = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요: ");
		int x = in.nextInt();
		int y = 1;

		if (x < 2 || x > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= x; i++) {
				y *= i;
			}
		}
		System.out.printf("%d ! = %d", x, y);
	}
	
	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~100사이의 정수를 입력하세요.: ");
		boolean isPrime = true;
		int su = sc.nextInt();
		for (int i=2; i<su; i++) {
			if(su%i == 0) {
				isPrime = false; break;
			}
		}
		System.out.println(isPrime?"소수":"소수아니다");
		sc.close();
	}

	private static void f1() {
		Scanner in = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요: ");
		int x = in.nextInt();

		if (x < 2 || x > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d", x, i, x * i);
				System.out.println();
			}
		}
	}

}

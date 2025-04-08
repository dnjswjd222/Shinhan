package com.shinhan.day01;

public class VariableTest1 {
	// 변수 : 값은 변할수있다. 값을 저장하기 위한 저장공간 이름
	// 변수타입 변수이름
	// 변수타입 : data의 성격 (정수, 실수, 논리값 등), data저장, 연산, 비교가능
	// 정수 : byte, short, char, int, long
	// 실수 : float, double
	// 논리값 : boolean
	// Wrapper class = 자바의 기본형타입 + 기능
	// Byte, Short, Character, Integer, Long, Float, Double, Boolean

	public static void main(String[] args) {
		f7();
	}

	private static void f7() {
		boolean v1 = true;
		boolean v2 = false;
		int v3 = 100;
		boolean v4 = v3 >= 90 && v3 <= 100;
		
		System.out.println(v4);
	}

	private static void f6() {
		//실수값의 기본은 double이다.
		double v1 = 3.14;
		float v2 = 3.14f;
	}

	private static void f5() {
		//자바의 리터럴값은 기본이 int
		//long v1 = 2147483648 -> int 범위 벗어나서 오류;
		//L, l 대소문자 무관
		long v1 = 2147483648L;
		System.out.println(v1);
	}

	private static void f4() {
		//int v1 = 2147483647; // 4byte..4기가 저장가능, 가장 많이 사용
		int v1 = Integer.MAX_VALUE;
		System.out.println(v1);
		v1++;
		System.out.println(v1);
	}

	private static void f3() {
		char v1 = 'A';
		char v2 = '가';
		char v3 = 65;
		char v4 = 0x0041;
		char v5 = 44032;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}

	private static void f2() {
		short v1 = 32767;
		v1++;
		v1++;
		System.out.println(v1);
	}

	private static void f1() {
		// 변수선언, 할당, 사용
		// 함수내에 있는 변수는 지역변수이다. 지역변수는 반드시 초기화후 사용한다. 초기화없이 사용하면 컴파일 오류
		byte v1;
		v1 = 127;
		v1++;
		System.out.println(v1);
	}

}

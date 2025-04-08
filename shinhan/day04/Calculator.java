package com.shinhan.day04;

public class Calculator {
	String company;

	//정수 2개를 받아서 합계를 return한다.
	int add(int a, int b) {
		return a+b;
	}
	
	//함수의 Overloading : 함수이름같고 매개변수 사양이 다르다.
	int add3(int i, int j, int k) {
		return i+j+k;
	}
	String add(String a, String b) {
		return a+b;
	}
}

package com.shinhan.day04;

public class OverloadingTest {

	public static void main(String[] args) {
		f1(10, "", true);
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5));
	}

	private static int sum(int...arr) {
		int result = 0;
		for(int su:arr) {
			result += su;
		}
		return result;
	}

	private static int sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}

	//Overloading
	//1.함수이름같다
	//2.매개변수 갯수와 타입이다르다
	//3.return값이 같을수도 다를수도
	
	private static int f1(int i, String string, boolean b) {
		return 100;
	}

}

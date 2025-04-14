package com.shinhan.day09.lab34567;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("암호화할 문자열 : ");
		String s = sc.nextLine();
		System.out.print("암호화된 문자열 : ");
		for (char c : s.toCharArray()) {
			int temp = c + 3;

			// 문자가 소문자 알파벳일 경우
			if (c >= 'a' && c <= 'z') {
				if (temp > 'z') { // 'z'를 초과하면 a~z 범위로 되돌림
					temp -= 26;
				}
				System.out.print((char) temp);

				// 문자가 대문자 알파벳일 경우
			} else if (c >= 'A' && c <= 'Z') {
				if (temp > 'Z') { // 'Z'를 초과하면 A~Z 범위로 되돌림
					temp -= 26;
				}
				System.out.print((char) temp);

			} else { // 알파벳이 아닌 문자(공백, 특수문자 등)는 그대로 출력
				System.out.print(c);
			}
		}
	}
}
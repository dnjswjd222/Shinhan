package com.shinhan.day09;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionTest {
	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		//한글로 시작(^) 정규표현식, 끝난다($)
		String regExp = "^([가-힣])\\w+([가-힣]$)";
		String data = "김dtrgcgtrcxt현";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println("---------------");
		}
	}

	private static void f2() {
		//+는 1개이상, *는 0개이상, ?는 0,1개
		String regExp = "[0-9A-Za-z]+@(\\w+)\\.\\w+";
		String data = "wed0406@daum.net";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		HashSet<String> hs = new HashSet<>();
		
		data = "이메일은 wed0406@daum.net wed0406@daum.net wed0406@naver.net wed0406@gamil.com입니다. 추가 이메일은 wed0406@daum.net로 보내주세요";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group());
			hs.add(matcher.group(1));
			System.out.println("---------------");
		}
		System.out.println(hs.size() + "가지");
	}

	private static void f1() {
		//[] : 선택
		//- : 범위
		//{3} : 3자리수, {3,4} : 3자리거나 4자리
		String regExp = "[01]{3}-[0-9]{3,4}-[0-9]{4}";
		String data = "010-1234-5678";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		String regExp2 = "([01]{3})-([0-9]{3,4})-([0-9]{4})";
		data = "aaaaaaa 010-1234-9999 bbbb 011-123-9999";
		Pattern pattern = Pattern.compile(regExp2);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
		}
	}
}

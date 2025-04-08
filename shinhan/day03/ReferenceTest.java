package com.shinhan.day03;

import java.util.Scanner;

public class ReferenceTest {

	public static void main(String[] args) {
		//f2("과장");
		f7();
	}

	private static void f8() {
		Scanner in = new Scanner(System.in);
		System.out.println("두수입력(,구분)>>");
		String data = in.nextLine();
		String arr[] = data.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
	}

	private static void f7() {
		String board = "게시글번호,제목,내용 작성자%라라라";
		//이름은 하나이고 같은 타입의 데이터를 여러개 저장하기 위한 연속적인 저장공간: 배열
		String arr[] = board.split(",| |%");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void f5() {
		String s1 = "Java Program"; //.toUpperCase()
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		
		System.out.println(s1.replace("Java", "자바"));
		System.out.println(s1);
		for(int i=0; i<s1.length(); i++) {
			char ch = Character.toUpperCase(s1.charAt(i));
			System.out.println(ch);
		}
	}

	private static void f4() {
		String s1 = null; //아직 참조하고 있지 않다고 초기화함, 지역변수는 반드시 초기화 후 사용 가능때문
		System.out.println(s1);
		System.out.println(s1.charAt(0)); //null값에 기능사용 불가
	}

	private static void f3() {
		String s1 = "자바";
		String s2 = s1;
		String s3 = new String("자바");
		
		//String은 고정문자열이다. 변경불가
		s1 = s1 + "!!!";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

	private static void f2(String str) {
		str += "님";
		int salary = 0;
		if (str.equals("과장님")) {
			salary = 100;
		}else if (str.equals("부장님")) {
			salary = 200;
		}else {
			salary = 300;
		}
		System.out.println(str + "==>" + salary);
		
	}

	private static void f1() {
		String s1 = "자바"; //컴파일타임에 객체생성
		String s2 = "자바";
		String s3 = new String("자바"); //실행시 객체생성
		String s4 = new String("자바");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(s1==s2); //주소가 같다
		System.out.println(s3==s4); //주소가 다르다
		System.out.println(s1.equals(s3)); //내용이 같다
		
		s1 += "프로그램";
		s2 += "프로그램";
		System.out.println(s1==s2); //주소가 다르다
		System.out.println(s1.equals(s2)); //내용이 같다
	}

}

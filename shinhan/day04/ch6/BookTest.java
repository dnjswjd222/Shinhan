package com.shinhan.day04.ch6;

public class BookTest {
	
	public static void main(String[] args) {
		//1.객체참조변수선언 + 2.객체생성
		Book[] arr = new Book[5];
		
		arr[0] = new Book();
		arr[1] = new Book("SQL배우기", "홍길동", 20000);
		arr[2] = new Book("Web배우기", 30000);
		arr[3] = new Book(50000, "김민성");
		arr[4] = new Book(70000);
		
		arr[0].title="이것이 자바다";
		arr[0].author="신용권";
		arr[0].price=38000;
		
		for(Book b:arr) {
			b.bookInfo();
		}
	}
	
	private static void print(Book b1) {
		System.out.println("----------");
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
	}

	public static void f1(String[] args) {
		//1.객체참조변수선언
		Book b1;
		//2.객체생성...field가 자동초기화된다.
		b1 = new Book();
		//3.객체사용
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
	}
}

package com.shinhan.day05;

//final: 최종을 의미, 한번초기화하고 변경 불가능
public class Book {
	String title;
	int price;
	
	//final field: 선언시 또는 생성시에만 초기화
	final String author1="김작가";
	final String author2;
	
	//상수(static final): 이 class의 모든 object가 같은 값을 가지고 변경불가
	//선언시에만 값 할당이 가능하다.
	//일반적으로 이름은 대문자로 쓴다.
	static final String PUBLISHER = "신한출판사";
	static final double PI = 3.141592;
	
	public Book() {
		this.author2 = "아무개";
	}
	public Book(String title, int price, String author2) {
		super();
		this.title = title;
		this.price = price;
		this.author2 = author2;
	}
	void updateAuthor(String author2) {
		//final field는 값 할당후 변경불가
		//this.author2 = author2;
	}
	
	//final method...재정의 불가능(오버라이딩 불가능)
	final void display() {
		System.out.println("Book의 display method이다.");
	}
	
	//final class...상속 불가능

	}

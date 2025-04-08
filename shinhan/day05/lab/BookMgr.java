package com.shinhan.day05.lab;

public class BookMgr {
	private Book[] booklist;

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (Book b : booklist) {
			System.out.println(b.getTitle());
		}
	}

	void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum = 0;
		for (Book b : booklist) {
			sum += b.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}

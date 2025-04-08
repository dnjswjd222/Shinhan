package com.shinhan.day05;

public class StudentTest {

	public static void main(String[] args) {
		f2();
	}
	
	private static void f2() {
		Student st5 = new Student("홍길동4","경제", 80, true);
		st5.print();
	}

	private static void f1() {
		System.out.println("before 학생수: " + Student.getCount());
		Student st1 = new Student();
		Student st2 = new Student("홍길동");
		Student st3 = new Student("홍길동", "컴공");
		Student st4 = new Student("홍길동", "식품",100);
		Student st5 = new Student("홍길동", "식품",100, true);
		
		System.out.println("after 학생수: " + Student.getCount());
	}
}

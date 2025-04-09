package com.shinhan.day07;

public class InheritenceTest {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		Circle v1 = new Circle(3);
		Rectangle v2 = new Rectangle(10,20);
		call2(v1);
		call2(v2);
	}
	
	private static void call2(Shape shape) {
		double area = shape.getArea();
		System.out.println(shape.getClass().getSimpleName() + "면적: " + area);
	}

	private static void f3() {
		Child1 v1 = new Child1(99, "홍길동");
		Child2 v2 = new Child2();
		
		f4(v1);
		f4(v2);
	}
	//자동형변환: 부모의 타입 = 자식의 객체
	private static void f4(Parent p) {
		//field접근: 타입을 따른다.
		System.out.println(p.score);
		//메소드는 instance를 따른다.
		//사용법은 같으나 실행결과는 다르다.(다형성)
		p.info();
	}

	private static void f2() {
		Child1 v1 = new Child1(100, "문자");
		v1.score = false;
		//v1.myName = "문자";
		System.out.println(v1.score);
		System.out.println(v1.myName);
		//메소드 호출은 instance를 따른다.
		v1.info();
		v1.display();
	}

	private static void f1() {
		Child1 v1 = new Child1();
		//v1.score = 100;
		System.out.println(v1.score);
		v1.info();
		
		Child2 v2 = new Child2();
		v2.score = 200;
		System.out.println(v2.score);
		v2.info();
	}

}

package com.shinhan.day10;

import java.util.ArrayList;

public class GenericTest {
	
	//제네릭 메소드
	public static <M,S,C> Bag<M,S,C> makeBag(M model, S size, C color){
		//Bag<M,S,C> bag1 = new Bag(model, size, color);
		return new Bag(model, size, color);
	}
	
	public static void main(String[] args) {
		Product<String, String> result_product = makeProduct("문자", "문자2", 3000);
		System.out.println(result_product);
		
		Product<Integer, String> result_product2 = makeProduct(100, "문자", 4000);
		System.out.println(result_product2);
	}
	
	public static <A,B> Product<A,B> makeProduct(A a, B b, int price) {
		Product<A, B> p1 = new Product();
		Product<A, B> p2 = new Product(a, b, price);
		return p2;
	}
	
	private static void f3() {
		ArrayList<String> data = new ArrayList();
		data.add("자바프로그램");	
		String s = (String)data.get(0);
		System.out.println(s);

	}

	private static void f2() {
		//Collection : List(순서있음, 중복허용), Set(순서없음, 중복불가), Map(키와 값의 쌍)
		//List interface: 구현class...ArrayList, LinkedList, Vector 등
		
		ArrayList data = new ArrayList();
		data.add(100);
		data.add("자바프로그램");
		data.add(new Car("abc", 1000));
		
		int i = (Integer)data.get(0);
		String s = (String)data.get(1);
		Car c = (Car)data.get(2);
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(c);
	}

	private static void f1() {
		Product<String, String> p1 = new Product<String, String>("ABC","large",1000);
		//int -> Integer (AutoBoxing)
		Product<String, Integer> p2 = new Product<>("DDD", 10, 2000);
		Product<Integer, Integer> p3 = new Product<>(1, 2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}

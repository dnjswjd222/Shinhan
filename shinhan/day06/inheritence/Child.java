package com.shinhan.day06.inheritence;

//자바는 단일상속만 가능(부모 1개)
//자식이 부모를 선택한다.
public class Child extends Parent{
	//상속받은 추가가능
	int salary;
	
	public Child() {
		System.out.println("자식의 default 생성자");
	}
	
	public Child(String name, int age) {
		//super() //암시적으로 기본 생성자를 부른다.
		//this.name = name;
		//this.age = age;
		//명시적으로 부모의 생성자를 부른다.
		super(name, age);
		System.out.println("자식의 arg2개 생성자");
	}
	
	public Child(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
		System.out.println("자식의 arg3개 생성자");
	}
	
	void display() {
		print();
		System.out.println("급여는 " + salary);
	}
}

package com.shinhan.day05;

public class Car{
	String model;
	String color;
	int price;
	
	//field
	static String company;
	//method...여러번 호출가능(함수)
	static void staticMethod() {
		//static에서 non-static 사용불가
		//System.out.println(model);
		Car c = new Car();
		System.out.println(c.model);
	}
	//block...호출하지않아도 수행된다. 호출불가
	static {
		System.out.println("static block1");
		Car c = new Car();
		System.out.println(c);
		
		//static에서 non-static 사용불가
		//String s = toString();
	}
	static {
		System.out.println("static block2");
	}
	//super: 부모를 의미
	//super(): 부모를 생성후 자식을 생성한다. 자동실행 -> 첫줄에만 가능
	//생성자에서 instance method 사용불가
	//생성자가 수행후 instance  method 사용가능하기 때문
	public Car() {
		this(null, null, 0);
		System.out.println("기본생성자");
	}
	
	int f1() {
		return 100;
	}
	public Car(String model) {
		this(model, null, 0);
	}

	public Car(String model, String color) {
		//this(): 생성자가 같은이름의 다른 생성자 호출시 사용
		this(model, color, 1000);
		}

	public Car(String model, String color, int price) {
		//this.: 멤버변수와 매개변수가 이름같아서 충돌발생, 구분하기위해 현재객체를 this라고 한다.
		this.model = model;
		this.color = color;
		this.price = price;
	}
	//Override(덮어쓰기, 재정의) 부모가 정의한 함수를 변경한다.
	//함수의 정의가 같아야 가능하다.(이름같고 매개변수같고 return도 같아야한다)
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
}

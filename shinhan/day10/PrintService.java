package com.shinhan.day10;

public class PrintService {

	@PrintAnnotation
	public void method1() {
		System.out.println("실행1 ->");
	}
	
	@PrintAnnotation(value = "*")
	public void method2() {
		System.out.println("실행2 ->");
	}
	
	@PrintAnnotation(value = "#", number1 = 10)
	public void method3() {
		System.out.println("실행3 ->");
	}
	
	@PrintAnnotation(value = "#", number1 = 10, number2=29)
	public void method4() {
		System.out.println("실행4 ->");
	}
}

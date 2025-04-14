package com.shinhan.day10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = PrintService.class;
		
		Method[] methodArr = cls.getDeclaredMethods();
		
		for(Method method:methodArr) {
			System.out.println("메소드 이름: " + method.getName());
			
			PrintAnnotation anno = method.getAnnotation(PrintAnnotation.class);
			System.out.println("value: " + anno.value());
			System.out.println("number: " + anno.number1());
			
			display(anno.value(), anno.number1());
			method.invoke(new PrintService());
		}
	}

	private static void display(String value, int number1) {
		for(int i=1; i<=number1; i++) {
			System.out.print(value);
		}
	}
}
	


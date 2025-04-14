package com.shinhan.day10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number1() default 7;
	int number2() default 10;
}

/*
@override
@ToString(of = {"model","price"})
@PrintAnnotation(value="aa", number = 10)
*/
package com.shinhan.day08.exception;

//사요자정의 Exception 만들기
public class MyException extends RuntimeException {

	String message;
	public MyException(String message) {
		super(message);
	}
}

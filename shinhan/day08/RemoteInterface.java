package com.shinhan.day08;

@FunctionalInterface //람다표현식 가능한가 체크(함수 1개일때만 가능)
public interface RemoteInterface {

	public abstract String buttonClick(int a, int b);
}

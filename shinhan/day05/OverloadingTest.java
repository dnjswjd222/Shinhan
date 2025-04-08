package com.shinhan.day05;

public class OverloadingTest {
	public static void main(String[] args) {
		Calculator.add();
		Calculator.add(1,2,3);
		Calculator.add(1.2f, 2.2f, 3.5);
		Calculator.add('A',"BC","자바");
		Calculator.add(1,2);
		Calculator.add(1,2,3,4,5,6,7,8,9,10);
		
		Calculator cal = new Calculator();
		int[] arr = {1,2,3,4,5}; //new int[] 생략 가능
		int result1 = cal.sum(new int[]{1,2,3,4,5});
		int result2 = cal.sum(arr);
		
		System.out.println(result1 + "---" + result2);
		int aa = cal.display(10);
		System.out.println(aa);
		
		double bb = Math.ceil(3.1); //소수점 올림 
		System.out.println(bb);
		
		//static 사용법
		Calculator.f2();
		//non-static 사용법
		new Calculator().f1();
	}
}

class Calculator{
	
	//instance field(멤버 변수)
	String company;
	String color;
	
	//static field(class 변수)
	static int count;
	
	//instance method
	void f1() {		
	}
	
	//static method
	static void f2() {
	}
	
	int display(int num) {
		if(num%2==0) {
			System.out.println("짝수입니다.");
			return num+1; //이 함수를 호출한 곳으로 돌아간다. 아래의 코드들을 무시한다.
			//System.out.println("---return 아래문장 작성시 컴파일오류---"); 
		}
		System.out.println("홀수입니다.");
		return num+2;
	}
	int sum(int...arr) {
		int total=0;
		for(int su:arr) {
			total += su;
		}
		return total;
	}
	//Overloading조건: 함수이름같다. 매개변수 타입과 개수가 다르다. return타입은 상관없다.
	static void add() {
		System.out.println("add method---매개변수 없음");
	}
	static void add(double a, double b, double c) {
		System.out.println("int 3개: " + (a+b+c));
	}
	static void add(char a, String b, String c) {
		System.out.println("char 1개 String 2개: " + (a+b+c));
	}
	static void add(int...arr) {
		int sum = 0;
		for(int s:arr) {
			sum += s;
		}
		System.out.println(sum);
	}
}

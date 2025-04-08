package com.shinhan.day04;

/*
 * 접근지정자(modifier)
 * public: 모든 패키지에서 접근이 가능
 * protected:
 * 생략: 같은 패키지에서만 접근이 가능
 * private:
 */
public class Person {
	static int numberOfPersons;
	int age;
	String name;
	
	public Person(){
		this(12, "Anonymous");
	}
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	//메서드, 함수: 반드시 return에 대한 정의가 필요하다.
	//return값이 없다면 void로 표시한다.
	public void selfIntroduce(){
		System.out.printf("내 이름은 %s이며, 나이는 %d살입니다.\n", name, age);
	}
	
	public static int getPopulation() {
		return numberOfPersons;
	}
}

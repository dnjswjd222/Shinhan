package com.shinhan.day05.lab;

public class Employee2 {
	private String id;
	private String name;
	private int baseSalary;
	
	public Employee2(String id, String name, int baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public double getSalary(double bonus) {
		double salary = baseSalary + baseSalary * bonus;
		return salary;
	}
	//toString()은 모든 class의 부모class로 사용하는 object에서 제공되는 함수이다. 재정의가능하다.
	//접근지정자(Modifier)는 같거나 더 넓어져야한다.
	//접근권한: public > protected > 생략 > private
	public String toString() {
		String print = name + "(" + id + ") 사원의 기본급은 "
				+ baseSalary + "원 입니다!!!!!";
		return print;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
}

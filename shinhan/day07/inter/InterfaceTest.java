package com.shinhan.day07.inter;

interface InterA{
	void call1();
}
interface InterB{
	void call2();
}
interface InterC extends InterA,InterB{
	void call3();
}

class MyImpl implements InterC{

	@Override
	public void call1() {
		
	}

	@Override
	public void call2() {
		
	}

	@Override
	public void call3() {
		
	}
	
}

//소스 InterfaceA.java -> 컴파일 InterfaceA.class
//interface: 규격서
interface InterfaceA {
	void f1();

	void f2();
}

interface InterfaceB {
	public abstract void f3();

	public abstract void f4();
}

abstract class ParentClass {
	public abstract void f5();
}

//class는 다중상속불가
//class는 interface 여러개 구현가능
//추상메소드는 구현class가 반드시 구현할 의무가 있다.
class FirstZoneService extends ParentClass implements InterfaceA, InterfaceB {

	@Override
	public void f3() {
		
	}

	@Override
	public void f4() {
		
	}

	@Override
	public void f1() {
		
	}

	@Override
	public void f2() {
		
	}

	@Override
	public void f5() {
		
	}

}

public class InterfaceTest {
	public static void main(String[] args) {
		FirstZoneService v1 = new FirstZoneService();
		//자동형변환
		ParentClass v2 = new FirstZoneService();
		InterfaceA v3 = new FirstZoneService();
		InterfaceB v4 = new FirstZoneService();
		
		work(v1);
		work(v2);
		work(v3);
		work(v4);
	}

	// 자동형변환(부모 = 자식)
	private static void work(ParentClass service) {

	}

	private static void work(Object service) {

	}
}
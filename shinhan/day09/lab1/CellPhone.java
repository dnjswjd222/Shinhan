package com.shinhan.day09.lab1;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor //필수(final) field를 초기화하는 생성자를 만들기
@EqualsAndHashCode(of = {"model"})
public class CellPhone {

	private final String model;
	private double battery;
	
//	public CellPhone(String model){
//		this.model = model;
//	}
	//RuntimeException은 자동으로 던져짐
	void call(int time) {
		if(time<0) throw new IllegalArgumentException("통화시간입력오류");
		System.out.println("통화 시간: " + time);
		battery -= (time*0.5);
		if(battery <= 0)
			battery = 0;
	}
	
	void charge(int time) {
		if(time<0) throw new IllegalArgumentException("충전시간입력오류");
		System.out.println("충전 시간: " + time);
		battery += (time*3);
		if(battery >= 100)
			battery = 100;
	}
	
	void printBattery() {
		System.out.printf("남은 배터리 양: %3.1f\n", battery);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CellPhone)) return false;
		
		CellPhone other = (CellPhone)obj;
		if(model.equals(other.model))
			return true;
		else return false;
	}
	
	
}

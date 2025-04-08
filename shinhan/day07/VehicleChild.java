package com.shinhan.day07;

import com.shinhan.day06.inheritence.Vehicle;

public class VehicleChild extends Vehicle{
	VehicleChild(){
		super("",0);
	}
	
	void method1() {
		start();
		stop();
		info();
	}
}

package com.shinhan.day03;

import java.util.Calendar;

public class EnumTest {
	
	//pi -> 3.14
	//상수 ...변하지 않는 값
	static final int SUCCESS = 1;
	static final int FAIL = 0;
	static final int MONDAY = 0;
	
	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		Week[] arr = Week.values();
		for(Week i:arr) {
			System.out.println(i.ordinal() + i.name());
		}
		Week today = null;
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println(today);
	}

	private static void f2() {
		//enum: 열거형, 한정적인 값들의 묶음, 관련있는 상수들을 묶음
		JobResult a = JobResult.SUCCESS;
		JobResult[] arr = JobResult.values();
		for(JobResult job: arr) {
			System.out.println(job);
		}
	}

	private static void f1() {
		//어떤 작업의 결과가 성공인지(1), 실패인지(0) 판단하고자 한다.
		int result = 1;
		if (result == SUCCESS) {
			System.out.println("성공");
		}else if(result == FAIL) {
			System.out.println("실패");
		}
	}

}

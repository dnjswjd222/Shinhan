package com.shinhan.day04;

import java.util.Arrays;
import java.util.Scanner;

public class LAB3 {
	//1.field(속성, 특징, 변수)...이 class의 모든 메서드에서 공유하는 변수
	static Scanner in = new Scanner(System.in);
	static String[] nameA;
	static int[] scoreA;
	static Grade[] gradeA;
	
	public static void main(String[] args) {
		boolean isEnd = false;
		while(!isEnd) {
			menuDisplay();
			int job = in.nextInt();
			switch(job) {
			case 1 -> {f_insert();}
			case 2 -> {f_select();}
			case 3-> {f_max();}
			case 4 -> {f_mean();}
			case 5 -> {f_upperScore();}
			case 6 -> {isEnd = true;}
			default -> {
				System.out.println("지원되지 않는 기능입니다.");
			}
			}
		}
		System.out.println("===== 프로그램 종료 =====");
	}
	
	private static void f_upperScore() {
		int score = numberCheck("기준 점수를 입력하세요");
		System.out.printf("=== %d점 이상 학생 목===\n", score);
		for (int i=0; i<nameA.length; i++) {
			if (score <= scoreA[i]) {
				System.out.printf("%s - 점수: %d, 등급: %s\n", nameA[i], scoreA[i], gradeA[i]);
			}
		}
	}

	private static void f_mean() {
		if(!nullCheck()) return;
		double total = 0;
		int count = 0;
		
		for (int i=0; i<nameA.length; i++) {
			total += scoreA[i];
			count++;
		}
		System.out.println("전체 학생의 평균 점수: " + total/count);
	}

	private static void f_max() {
		if(!nullCheck()) return;
		int max = 0;
		int x=0;
		
		for (int i=0; i<nameA.length; i++) {
			if(max < scoreA[i]) {
				max = scoreA[i];
				x=i;
			}
		}
		System.out.printf("최고 점수를 받은 학생: %s (%d점)\n", nameA[x], max);
	}

	private static void f_select() {
		if(!nullCheck()) return;
		System.out.println("=== 학생 성적 목록 ===");
		for (int i=0; i<nameA.length; i++) {
			System.out.printf("%s - 점수: %d, 등급: %s\n", nameA[i], scoreA[i], gradeA[i]);
		}
	}

	private static boolean nullCheck() {
		if(nameA == null) {
			System.out.println("학생정보가 아직 입력되지않아서 본 서비스 제공 불가합니다.");
			return false;
		}else return true;
	}
	
	private static int numberCheck(String message) {
		int count = 0;
		while(true) {
			System.out.print(message);
			if(in.hasNextInt()) {
				count = in.nextInt(); break;	
			}
			System.out.println("!!!반드시 숫자로 입력해야한다.!!!");
			in.next(); //입력된 잘못된 문자는 버린다.
		}
		return count;
	}
	
	private static void f_insert() {
		int count = numberCheck("학생 수를 입력하세요: ");
		nameA = new String[count];
		scoreA = new int[count];
		gradeA = new Grade[count];
		in.nextLine(); //학생수 입력후 enter는 버린다.
		for (int i=0; i<count; i++) {
			System.out.printf("%d번째 학생 이름, 점수>", i+1);
			String data = in.nextLine();
			String[] arr = data.split(",");
			nameA[i] = arr[0];
			scoreA[i] = Integer.parseInt(arr[1].trim()); //trim(): " 99" -> "99"
			gradeA[i] = getGrade(scoreA[i]);
		}
	}

	private static Grade getGrade(int score) {
		Grade result = null;
		switch(score/10) {
		case 9,10 -> result = Grade.A;
		case 8 -> result = Grade.B;
		case 7 -> result = Grade.C;
		case 6 -> result = Grade.D;
		default -> result = Grade.F;
		}
		return result;
	}

	//함수는 문장들의 묶음, 모듈화, 재사용
	static void menuDisplay() {
		System.out.println("----------------------------------------------------");
		System.out.println("1.학생수(이름,점수입력)  2.성적목록  3.최고 점수를 받은 학생 찾기");
		System.out.println("4.평균 점수  5.특정 점수 이상 학생  6.종료");
		System.out.println("----------------------------------------------------");
		System.out.print("선택> ");
	}

}

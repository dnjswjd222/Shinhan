package com.shinhan.day03;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		f9();
	}

	private static void f9() {
		int i=0;
		int j=1;
		int[] arr=null;
		
		Scanner in = new Scanner(System.in);
		while(i<5) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> " + j);
			switch(i) {
			case 0: {
				System.out.print("학생수> ");
				int x = in.nextInt();
				arr = new int[x];
				i++; j++; break;
			}
			case 1: {
				for(int a=0; a<arr.length; a++) {
					System.out.printf("scores[%d]> ", a);
					arr[a] = in.nextInt();
				}
				i++; j++; break;
			}
			case 2: {
				for(int a=0; a<arr.length; a++) {
					System.out.printf("scores[%d]: %d\n", a, arr[a]);
				}
				i++; j++; break;
			}
			case 3: {
				int x=0;
				int max=0;
				int total=0;
				for(int a=0; a<arr.length; a++) {
					x++;
					if(max< arr[a]) {
						max = arr[a];
					}
					total += arr[a];
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + (double)total/x);
				i++; j++; break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				i++;
				break;
			}
			}
		}
	}

	private static void f8() {
		int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};
		int x = 0;
		int total = 0;
		
		for (int[] i: array) {
			for(int j:i) {
				x++;
				total += j;
			}
		}
		System.out.println("합: " + total);
		System.out.println("평균: " + (double)total/x);
	}

	private static void f7() {
		int[] array = {1,5,3,8,2};
		int temp = 0;
		
		for (int i=0; i<array.length; i++) {
			if(array[i] > temp) {
				temp = array[i];
			}
		}
		System.out.println(temp);
	}

	private static void f1() {
		int a=100; //기본형은 stack에 메모리에 저장
		//int b=null; 기본형은 null을 할당불가
		String s = "자바"; //참조변수는 stack에 메모리에 저장, 생성된 객체는 heap에 저장
		String s2 = null; //객체참조변수는 null로 초기화 가능
		Integer c = null;
		
		System.gc(); //메모리 정리...불필요
	}
}

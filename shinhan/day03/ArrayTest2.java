package com.shinhan.day03;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		int[] arr = new int[] {10,20,30};
		int[] arr2 = arr; //같은 주소를 가리키고있다.
		
		int[] arr3 = new int[arr.length];
		System.arraycopy(arr2, 0, arr3, 0, arr3.length);		
		
		arr2[0] = 99; //arr3은 영향을 받지않음.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void f5() {
		String[][] arr1 = new String[3][4];
		
		for(int r=0; r<arr1.length; r++) {
			for(int c=0; c<arr1[r].length; c++) {
				System.out.printf("%s\t", arr1[r][c]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(String[] chArr:arr1) {
			for(String ch:chArr) {
				System.out.printf("%s\t", ch);
			}
			System.out.println();
		}
	}

	private static void f4() {
		boolean[][] arr1 = new boolean[][] {{true,false,true},{true,false}};
		
		for(int r=0; r<arr1.length; r++) {
			for(int c=0; c<arr1[r].length; c++) {
				System.out.printf("%s\t", arr1[r][c]);
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(boolean[] chArr:arr1) {
			for(boolean ch:chArr) {
				System.out.printf("%s\t", ch);
			}
			System.out.println();
		}
	}

	private static void f3() {
		char[][] arr1 = new char[][] {{65,66,67,68},{'가','나','다','라'},{'H','e','l','l','o'}};
		
		for(char[] chArr:arr1) {
			for(char ch:chArr) {
				System.out.printf("%10s", ch);
			}
			System.out.println();
		}
	}

	private static void f2() {
		char[][] arr1 = new char[][] {{65,66,67,68},{'가','나','다','라'},{'H','e','l','l','o'}};
		
		for(int r=0; r<arr1.length; r++) {
			for(int c=0; c<arr1[r].length; c++) {
				System.out.printf("%s\t", arr1[r][c]);
			}
			System.out.println();
		}
	}

	private static void f1() {
		//------2차원배열...배열의 배열
		//1.배열참조변수 선언
		//2.배열생성
		//3.배열사용
		int[][] arr1;
		int[] arr2[] = new int[4][];
		int arr3[][];
		
		arr1 = new int[3][4]; //배열의 길이 arr1.length -> 3, arr1[0].length -> 4
		System.out.println("배열의 길이: " + arr1.length);
		System.out.println("배열의 배열길이: " + arr1[0].length);
		System.out.println("값: " + arr1[0][0]); //다른 언어: [0,0]
		System.out.println("----------------------");
		arr2[0] = new int[] {10,20,30};
		arr2[1] = new int[] {1,2,3,4,5,6,7};
		arr2[2] = new int[] {7,8,9,4};
		arr2[3] = new int[6];
		//System.out.println(arr2[2][4]);
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				System.out.printf("%3d",arr2[row][col]);
			}
			System.out.println();
		}
	}

}

package com.shinhan.day03;

import java.util.Arrays;

public class LAB1 {

	public static void main(String[] args) {
		int[][] arr1 = {{30,30,30,30},{40,40,40,40},{50,50,50,50}};
		int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr3 = new int[3][4];
		
		prn(arr1);
		prn(arr2);
		sub(arr1,arr2,arr3);
		prn(arr3);
		
	}
	//반드시 return해야함
	public static int[][] sub(int[][] a, int[][] b, int[][] c){
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}
	//void: return없음을 의미
	public static void prn(int[][] c) {
		System.out.println("----------------");
		for(int[] arr1:c) {
			System.out.println(Arrays.toString(arr1));
		}
	}
	
	private static void f_sort() {
		int [] arr = new int[] {3,24,1,55,17,43,5};
		System.out.println("before:" + Arrays.toString(arr));
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println("after: " + Arrays.toString(arr));
	}
	

}

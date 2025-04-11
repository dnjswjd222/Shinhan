package com.shinhan.day09.lab34567;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("===============================");

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		Arrays.sort(values);
		int total = 0;
		for(int val:values) {
			total += val;
		}
		double avg = total/values.length;
		int min = values[0];
		for(int val:values) {
			if(Math.abs(avg - min) > Math.abs(avg - val))
				min = val;
			else if(Math.abs(avg - min) == Math.abs(avg - val))
				continue;
		}
		return min;
	}
}

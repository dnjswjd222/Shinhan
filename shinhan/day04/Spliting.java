package com.shinhan.day04;

import java.util.Arrays;

public class Spliting{
	public static void main(String[] args) {
		Spliting p = new Spliting();
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		String[] result = null;
		int x=1;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == separator) {
				x++;
			}
		}
		result = new String[x];
		String word = "";
		int index = 0;
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == separator) {
				result[index] = word;
				word=""; index++;
			}else {
				word += str.charAt(i);
			}
		}
		result[index] = word;
		//System.out.println(Arrays.toString(result));
		return result;
	}
}


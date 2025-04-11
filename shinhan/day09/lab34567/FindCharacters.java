package com.shinhan.day09.lab34567;

public class FindCharacters {
	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count = fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);
	}

	public int countChar(String str, char c) {
		// 작성
		int count=0;
		char[] ch = str.toCharArray();
		for(char ch2:ch) {
			if(ch2 == c)
				count++;
		}
		return count;
	}
}

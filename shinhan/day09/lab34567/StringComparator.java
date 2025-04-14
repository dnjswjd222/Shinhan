package com.shinhan.day09.lab34567;

public class StringComparator {
	public static void main(String[] args) {
		StringComparator sc = new StringComparator();
		int result1 = sc.compare("Yongari-2001", "DragonWar", true);
		int result2 = sc.compare("Yongari-2001", "DragonWar", false);
		System.out.println(result1);// 12
		System.out.println(result2);// 9
	}
	
	private int compare(String str1, String str2, boolean isLength) {
        if (isLength) {
            return (str1.length() > str2.length() ? str1.length() : str2.length());
        } else {
            int count1 = 0;
            int count2 = 0;
            for (char a : str1.toCharArray()) {
                if (a == 'a') count1++;
            }
            for(char a : str2.toCharArray()) {
                if (a == 'a') count2++;
            }
            return (count1>count2) ? str1.length() : str2.length();
        }
    }
}

package com.shinhan.day06;

public class SingleToneTest {
	public static void main(String[] args) {
		LoginServlet a = LoginServlet.getInstance();
		LoginServlet b = LoginServlet.getInstance();
		
		ShopService c = ShopService.getInstance();
		ShopService c2 = ShopService.getInstance();
		System.out.println(c==c2);
	}
}

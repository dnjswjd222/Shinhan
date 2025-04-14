package com.shinhan.day10;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ResourceTest {

	public static void main(String[] args) throws IOException {
		method1();
	}

	private static void method1() throws IOException {
		//프로젝트가 default 경로
		//FileReader fr = new FileReader("src/com/shinhan/day10/PrintService.java");
		
		//현재 class
		Class cls = ResourceTest.class;
		URL url = cls.getResource("aa/my.txt");
		System.out.println(url.getPath());
		InputStream is = cls.getResourceAsStream("aa/my.txt");
		int i;
		
		while((i= is.read()) != -1) {
			System.out.print((char)i);
		}
	}
}

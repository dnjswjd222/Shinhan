package com.shinhan.day13;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkTest {

	public static void main(String[] args) throws UnknownHostException {
		f1();
	}

	private static void f1() throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		String ip = InetAddress.getLocalHost().getHostAddress();
		System.out.println("local: " + local);
		System.out.println("ip: " + ip);
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
		Arrays.stream(naver).forEach(d -> System.out.println(d));
	}
}

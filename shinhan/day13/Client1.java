package com.shinhan.day13;

import java.io.IOException;
import java.net.*;

public class Client1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.194", 5001);
		System.out.println("클라이언트가 서버에 연결성공");
	}
}

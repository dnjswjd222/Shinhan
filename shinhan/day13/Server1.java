package com.shinhan.day13;

import java.io.IOException;
import java.net.*;

public class Server1 {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(5001);
		System.out.println("서버가 클라이언트의 접속을 기다림");
		Socket socket = serversocket.accept(); //블로킹
		
		InetSocketAddress addr = (InetSocketAddress)socket.getRemoteSocketAddress();
		System.out.println("접속정보: " + addr.getAddress());
	}
}

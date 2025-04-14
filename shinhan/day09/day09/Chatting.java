package com.shinhan.day09;

public class Chatting {
	//instance inner class
	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
	
	void f1() {
		Chatting.Chat aa = new Chatting().new Chat();
		aa.start();
		aa.sendMessage("메시지");
	}
	//static inner class
	static class Chat2 {
		void start() {
		}

		void sendMessage(String message) {
		}
	}

	void f2() {
		Chatting.Chat2 aa = new Chatting.Chat2();
		aa.start();
		aa.sendMessage("메시지2");
	}
	
	void startChat(String chatId) {
		String nickName = null; //초기화
		//nickName = chatId; //수정
		
		//익명 구현class (재정의)...Local Class...지역변수 사용가능 단, 지역변수는 final임 (수정불가)
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}
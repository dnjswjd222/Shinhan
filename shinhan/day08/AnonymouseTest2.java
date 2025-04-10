package com.shinhan.day08;

public class AnonymouseTest2 {

	public static void main(String[] args) {
		//1.구현class 사용하기
		work(new RemoteA(), 10, 20);
		work(new RemoteB(), 10, 20);
		
		work(new RemoteInterface() {

			@Override
			public String buttonClick(int a, int b) {
				return "익명구현 class: " +a*b;
			}
		}, 10, 20);
		
		RemoteInterface f = (aa,bb)->"람다표현식 사용: "+(aa/bb);
		work(f, 10, 3);
	}

	public static void work(RemoteInterface remote, int su1, int su2) {
		String result = remote.buttonClick(su1, su2);
		System.out.println(result);
		System.out.println("-------------------------");
	}
}

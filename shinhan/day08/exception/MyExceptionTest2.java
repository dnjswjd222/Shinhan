package com.shinhan.day08.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//프로그램은 오류가 발생하면 중단된다.
//Exception: 프로그래머의 노력으로 복구 가능한 오류(프로그램이 중단되지않고 계속 진행)
//1.RuntimeException: 실행시 오류 check,컴파일시 체크안함. UnChecked Exception
//JVM이 자동으로 던진다.
//---NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException ...
//2.일반 Exception: RuntimeException아닌 Exception, 반드시 컴파일시 Checked Exception
//해결방법1) 내 함수를 부른곳으로 떠넘긴다.: 함수의 선언부에 throws ExceptionClass이름
//해결방법2) 내가 해결한다.: (try~catch~finally)
public class MyExceptionTest2 {
	public static void main(String[] args) {
		f7();
	}

	private static void f7() {
		int score = -20;
		// JVM이 자동으로 예외처리를 할 수 없다.
		// 비지니스 로직에 의해 강제로 예외를 일으키고자한다.
		try {
			if (score < 0 || score > 100) {
				throw new MyException("0<=score<=100 만 가능");
			}
		} catch (MyException aa) {
			System.out.println(aa.getMessage());
		}

		System.out.println("----f7 END----");
	}

	// Checked Exception: 떠넘긴다 or 처리한다
	private static void f6() {
		try {
			Class aa = Class.forName("java.lang.String");
			System.out.println(aa.getName());
			System.out.println(aa.getSimpleName());
			System.out.println(aa.getModule());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void f5() {
		try (FileReader fr = new FileReader("src/com/shinhan/day08/InnerClassTest.java")) {
			int data;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 본래는 자원반납이 이루어지는 위치
			// try(!!!){}catch(){}finally{}
			// try를 벗어나면 자동으로 자원반납
		}
	}

	public static void f4(String[] args) {
		// f1(0);
		try {
			f3();
		} catch (FileNotFoundException ex) {
			System.out.println("파일의 경로와 이름 확인이 필요");
		} catch (IOException ex) {
			System.out.println("IO error");
		}
		System.out.println("===Main END===");
	}

	private static void f3() throws IOException {
		// 파일을 읽기위해 파일열기, 2byte씩 읽는다.
		FileReader fr = new FileReader("src/com/shinhan/day08/InnerClassTest.java");
		System.out.println("파일이 존재하므로 읽을수있다.");

		int data;
		while ((data = fr.read()) != -1) { // EOF(End Of File)
			System.out.print((char) data);
		}
		fr.close(); // 자원반납
	}

	private static void f2() {
		String str = null;

		try {
			System.out.println(str.length());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("반드시 수행한다.");
		}
		System.out.println("====f2 END====");
	}

	private static void f1(int j) {
		int[] arr = null;
		arr = new int[5];
		String score = "100점";

		try {
			int intScore = Integer.parseInt(score);
			System.out.println(intScore + 10);
			System.out.println("배열접근: " + arr[0]);
			System.out.println("배열접근: " + arr[5]);
			int i = 10 / j;
			System.out.println(i);
		} catch (ArithmeticException ex) {
			// Exception이 발생하면 자동으로 JVM이 Exception객체를 만든다
			// ex = new ArithmeticException()
			System.out.println(ex.getMessage());
		} catch (NullPointerException ex) {
			System.out.println("null은 접근불가");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("index범위 벗어남");
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			// 형변환이 자동으로 이루어지므로 맨상위의 class를 마지막에 작성한다.
			System.out.println("기타 Exception: " + ex.getMessage());
		} finally {
			System.out.println("Exception 발생여부와 무관하게 반드시 수행한다.");
		}
		System.out.println("====f1 END====");
	}
}

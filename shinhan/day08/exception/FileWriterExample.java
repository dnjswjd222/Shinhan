package com.shinhan.day08.exception;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.shinhan.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {
	public static void main(String[] args) throws Exception {
		//String path = FileCalculator.class.getResource("data2.txt").getFile();
		String path = "src/com/shinhan/day13/data2.txt";
		new FileCalculator().addCalculateResult(path);
		System.out.println("=====END=====");
	}
	
	void addCalculateResult(String inputFileName) throws Exception{
		FileReader fr = new FileReader(inputFileName);	
		BufferedReader br = new BufferedReader(fr);
		String line;
		int total = 0;
		List<String> dataList = new ArrayList();
		
		while ((line = br.readLine()) != null) {
			total += Integer.parseInt(line);
			dataList.add(line);
		}
		dataList.add(total+"");
		FileWriter fw = new FileWriter(inputFileName);
		BufferedWriter bw = new BufferedWriter(fw);
		
		dataList.stream().forEach(data->{
			try {
				bw.write(data);
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		br.close();fr.close();
		bw.close();fw.close();
	}
}

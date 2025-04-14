package com.shinhan.day10.thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintThread extends Thread {

	ShareArea shareArea;
	
	public void run() {
		for (int i=1; i<=3; i++) {
			//방법2)공유영역에 method를 만들고 
			shareArea.print();
			
			/*방법1) synchronized 블럭사용하기
			synchronized (shareArea) {
				System.out.println("[잔액합계]" + 
						(shareArea.getSung().getBalance()+shareArea.getLee().getBalance()));
			}
			*/
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

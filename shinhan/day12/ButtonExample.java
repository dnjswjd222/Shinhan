package com.shinhan.day12;

import com.shinhan.day12.Button.ClickListener;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {
			System.out.println("OK 버튼을 클릭하였습니다.");
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭하였습니다.");
			}
		});
		btnCancel.click();
		
	}
	
	public void work(Button.ClickListener clickListener) {
		Button button = new Button();
		button.setClickListener(clickListener);
		button.click();
	}
}

package com.shinhan.day05;

//class: object만드는 틀, Object는 각각의 특징을 갖는다.(field로 선언)
//VO(Value Object): 값을 저장하는 객체
//javaBeans(객체)
//업무로직은 작성하지 않고 단지 값을 저장하려는 목적
//DTO(Data Transfer Object): data를 저장해서 전송하려는 목적
public class NoteBook {
	private String model;
	private String company;
	private int price;

	public NoteBook(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	//Getter
	public String getModel() {
		return model;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	//Setter
	void setModel(String model) {
		this.model = model;
	}
}

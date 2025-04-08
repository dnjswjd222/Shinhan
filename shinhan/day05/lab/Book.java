package com.shinhan.day05.lab;

//업무로직은 없고 field정의, 생성방법, setter/getter만 존재
//VO(value object)
//DTO(data transfer object)
//JavaBeans기술 ...JSP/Servlet, Spring, Mybatis framework
public class Book {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	//EL : ${title} -> getTitle() 호출
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

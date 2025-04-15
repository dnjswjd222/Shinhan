package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

//JavaBeans기술 : 기본 생성자 필수(JSP의 Beans, Spring, Mybatis)
//default 생성자, setter, getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Board implements Comparable<Board> {
	private String subject;
	private String content;
	private String writer;
	@Override
	public int compareTo(Board obj) {
		//작성자로 ASC, 작성자가 같으면 subject로 DESC
		int comp1 = writer.compareTo(obj.writer);
		if(comp1 == 0) {
			return obj.subject.compareTo(subject);
		}
		return comp1;
	}
}

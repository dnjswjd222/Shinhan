package com.shinhan.day09;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//DTO(Data Transfer Object)
@ToString
@EqualsAndHashCode(of = "stdId")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentDTO {
	
	private final String stdId;
	private final String name;
	private String major;
	private int grade;
}

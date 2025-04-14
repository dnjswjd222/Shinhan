package com.shinhan.day10;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product<A,B> {

	A model;
	B size;
	int price;
	
}

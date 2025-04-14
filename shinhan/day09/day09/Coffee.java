package com.shinhan.day09;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode//(of = {"menuName","price"}) -> of: 포함
@ToString//(exclude = "price") -> exclude: 제외
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
	String menuName;
	int price;
	
}

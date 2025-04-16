package com.shinhan.day12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ShinhanStudent implements Comparable<ShinhanStudent>{

	String name;
	int score;
	@Override
	public int compareTo(ShinhanStudent o) {
		return o.score - score;
	}
	
	
}

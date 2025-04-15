package com.shinhan.day11;

import java.util.Comparator;

public class DescendingInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer obj1, Integer obj2) {
		//ascending: < = >
		//앞에 갑을 먼저 작성하면 ascending
		//뒤에 값을 먼저 작성하면 descending
		return obj2 - obj1;
	}

}

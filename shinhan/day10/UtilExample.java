package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Pair<K, V> {
	private K key;
	private V value;
}

class ChildPair<K, V, A> extends Pair<K, V> {
	A data;
	
	public ChildPair(K k, V v, A data) {
		super(k, v);
		this.data = data;
	}
}

@AllArgsConstructor
@Getter
class OtherPair<K, V> {
	private K key;
	private V value;
}

class Util{
	//파라미터로 받은 첫번째 값이 Pair만 된다. Pair<K,V>, Pair<K,V>의 하위도 가능하다. 상위 = 하위
	static <K,V> V getValue(Pair<K,V> pair, K key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}

	static <P extends Pair<K,V>, K, V> V getValue2(P pair, K key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}
}

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer, String> childPair = new ChildPair<>("홍삼원", 20, "zzz");
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);

		//OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		//int otherAge = Util.getValue(otherPair, "홍삼원");
		//System.out.println(otherAge);
		/*
		 * OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
		 * //OtherPair는 Pair를 상속하지 않으므로 컴파일 에러가 발생 int otherAge =
		 * Util.getValue(otherPair, "홍삼원"); System.out.println(otherAge);
		 */
	}
}


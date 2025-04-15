package com.shinhan.day11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest2 {
	public static void main(String[] args) {
		f15();
	}

	private static void f15() {
		List<String> mylist = new ArrayList();
		mylist.add("A");mylist.add("B");mylist.add("C");mylist.add("D");
		
		//수정불가한 Collection: of(), copy(), asList()
		
		List<Integer> data = List.of(10,20,30,40,50);
		List<String> data2 = List.of("자바", "데이터베이스", "프레임워크");
		Set<Integer> data3 = Set.of(10,20,30,40,50); //중복된 값은 set만들기 불가
		Map<String, Integer> data4 = Map.of("A",100,"B",200);
		List<String> data5 = List.copyOf(mylist);
		Integer[] arr = {100,90,60,70,40};
		List<Integer> data6 = Arrays.asList(arr);
		//data.add(60); 실행오류, 수정 불가
		System.out.println(data4);
	}

	private static void f14() {
		List<String> data = Collections.synchronizedList(new ArrayList());
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add("내용"+i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add("내용"+i);
				}
			}
		};
		t1.start();t2.start();
		try {
			t1.join();t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("map size: " + data.size());
	}

	private static void f13() {
		Map<Integer, String> data = Collections.synchronizedMap(new HashMap());
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.put(i, "내용"+i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.put(i, "내용"+i);
				}
			}
		};
		t1.start();t2.start();
		try {
			t1.join();t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("map size: " + data.size());
	}

	private static void f12() {
		Queue<Student> data = new LinkedList();
		Student st1 = Student.builder().stdId("1").name("김").major("컴공").score(99).build();
		Student st2 = Student.builder().stdId("2").name("김").major("컴공").score(99).build();
		Student st3 = Student.builder().stdId("4").name("김").major("컴공").score(99).build();
		Student st4 = Student.builder().stdId("3").name("김").major("컴공").score(99).build();
		Student st5 = Student.builder().stdId("5").name("김").major("컴공").score(99).build();
		
		data.offer(st1);
		data.offer(st2);
		data.offer(st3);
		data.offer(st4);
		data.offer(st5);
		System.out.println("사이즈: " + data.size());
		while(!data.isEmpty()) {
			System.out.println(data.poll());
		}
		System.out.println("사이즈: " + data.size());
	}

	private static void f11() {
		Stack<Student> st = new Stack();
		Student st1 = Student.builder().stdId("1").name("김").major("컴공").score(99).build();
		Student st2 = Student.builder().stdId("2").name("김").major("컴공").score(99).build();
		Student st3 = Student.builder().stdId("4").name("김").major("컴공").score(99).build();
		Student st4 = Student.builder().stdId("3").name("김").major("컴공").score(99).build();
		Student st5 = Student.builder().stdId("5").name("김").major("컴공").score(99).build();
		st.push(st1);
		st.push(st2);
		st.push(st3);
		st.push(st4);
		st.push(st5);
		System.out.println("사이즈: " + st.size());
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println("사이즈: " + st.size());
	}

	private static void f10() {
		TreeMap<String, Integer> data = new TreeMap();
		data.put("apple", 10);
		data.put("aa", 10);
		data.put("bb", 10);
		data.put("cc", 10);
		data.put("dd", 10);
		data.put("apple", 20);
		
		System.out.println("first: " + data.firstKey());
		System.out.println("first entry: " + data.firstEntry());
		
		NavigableMap<String, Integer> data2 = data.descendingMap();
		
		System.out.println("=====key set=====");
		for(String key: data2.keySet()) {
			System.out.println(key + "==>" + data.get(key));
		}
		
		System.out.println("=====entry set=====");
		for(Entry<String,Integer> entry:data2.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void f9() {
		TreeSet<Integer> data = new TreeSet();
		data.add(100);
		data.add(300);
		data.add(200);
		data.add(500);
		data.add(400);
		
		System.out.println("first: " + data.first());
		System.out.println("last: " + data.last());
		System.out.println("lower: " + data.lower(300));
		System.out.println("higher: " + data.higher(300));
		
		NavigableSet<Integer> data2 = data.descendingSet();
		System.out.println("=====data 목록=====");
		for(Integer i:data2)
			System.out.println(i);
		
		System.out.println("=====부분 집합(<=)=====");
		NavigableSet<Integer> data3 = data.tailSet(300,true);
		for(Integer i:data3)
			System.out.println(i);
		
		System.out.println("=====부분 집합(<=, <)=====");
		NavigableSet<Integer> data4 = data.subSet(200,true, 400,false);
		for(Integer i:data4)
			System.out.println(i);
	}

	private static void f7() {
		//조회기능이 강화된 자료구조
		//배열, List(Array, Linked, Vector), Set(HastSet, TreeSet), Map(HashMap, HashTable, HashTree)
		TreeSet<Student> data = new TreeSet();
		data.add(Student.builder().stdId("1").name("김").major("컴공").score(99).build());
		data.add(Student.builder().stdId("5").name("김").major("컴공").score(99).build());
		data.add(Student.builder().stdId("4").name("김").major("컴공").score(99).build());
		data.add(Student.builder().stdId("3").name("김").major("컴공").score(99).build());
		data.add(Student.builder().stdId("2").name("김").major("컴공").score(99).build());
		
		for(Student st:data) {
			System.out.println(st);
		}
	}

	private static void f6() {
		TreeSet<String> data = new TreeSet();
		data.add("B");
		data.add("A");
		data.add("D");
		data.add("E");
		data.add("B");
		
		for(String i:data)
			System.out.println(i);
	}
	
	private static void f5() {
		TreeSet<Integer> data = new TreeSet();
		data.add(100);
		data.add(300);
		data.add(200);
		data.add(500);
		data.add(400);
		
		for(Integer i:data)
			System.out.println(i);
	}

	private static void f4() {
		Board[] arr = {new Board("a","a2","a3"),
				new Board("b","b2","b3"),
				new Board("c","c2","c3"),
				new Board("d","d2","d3"),
				new Board("e","e2","e3")};
		Arrays.sort(arr);
	}

	private static void f3() {
		String a = "b";
		String b = "a";
		
		System.out.println(a.compareTo(b));
	}

	private static void f2() {
		String[] arr = {"java","sql","web","html","js"};
		
		//자바가 제공하는 Sort이용(Ascending)
		//Arrays.sort(arr);
		
		//Sort 기준 바꾸기(Descending)
		/*Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});*/
		
		Arrays.sort(arr, (o1,o2) -> o2.compareTo(o1));
		System.out.println("before: " + Arrays.toString(arr));
	}

	private static void f1() {
		Integer[] arr = { 80, 66, 90, 41, 64 };

		System.out.println("before: " + Arrays.toString(arr));
		// SORT 직접구현
		// f_sort(arr);

		// java가 제공하는 sort 이용...ascending
		// Arrays.sort(arr);

		// java가 제공하는 sort 이용...sort 기준 변경
		// 1.구현 class 만들기
		// Arrays.sort(arr, new DescendingInteger());
		// 2.익명 구현 class 만들기
		/*Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});*/
		// 3.람다표현식
		Arrays.sort(arr, (a,b) -> b-a);
		System.out.println("after: " + Arrays.toString(arr));

	}

	private static void f_sort(int[] arr) {
		// selection sort (Ascending)
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

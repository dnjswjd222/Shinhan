package com.shinhan.day12;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) throws URISyntaxException, IOException {
		f23();
	}

	private static void f23() {
		Random random = new Random();
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<100000000; i++) {
			scores.add(random.nextInt(101)); // 0< <101
		}
		
		long start = 0;
		long end = 0;
		long time = 0;
		double avg = 0;
		Stream<Integer> stream = scores.stream();
		start = System.nanoTime();
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		end = System.nanoTime();
		time = end - start;
		System.out.println("일반스트림 시간: " + time);
		
		Stream<Integer> stream2 = scores.parallelStream();
		start = System.nanoTime();
		avg = stream2.mapToInt(i -> i.intValue()).average().getAsDouble();
		end = System.nanoTime();
		time = end - start;
		System.out.println("병렬스트림 시간: " + time);
	}

	private static void f22() {
		List<ShinhanStudent2> data = List.of(
				new ShinhanStudent2("김",100,"남"),
				new ShinhanStudent2("박",60,"남"),
				new ShinhanStudent2("정",70,"여"),
				new ShinhanStudent2("양",90,"여"),
				new ShinhanStudent2("최",80,"남")
				);
		Map<String, List<ShinhanStudent2>> groupMap = data.stream()
				.collect(Collectors.groupingBy(st->st.getGender()));
		for(String st:groupMap.keySet()) {
			System.out.println(st + "==>" + groupMap.get(st));
		}
		
		Map<String, Double> groupMap2 = data.stream()
				.collect(Collectors.groupingBy(st->st.getGender(),
						Collectors.averagingDouble(st->st.getScore())));
		for(String st:groupMap2.keySet()) {
			System.out.println(st + "==>" + groupMap2.get(st));
		}
	}

	private static void f20() {
		ShinhanStudent[] arr = {
				new ShinhanStudent("A",100),
				new ShinhanStudent("E",60),
				new ShinhanStudent("C",70),
				new ShinhanStudent("B",90),
				new ShinhanStudent("D",80),
		};
		List<ShinhanStudent> data = Arrays.asList(arr);
		
		List<ShinhanStudent> data2 = data.stream().filter(st->st.getScore()>70).toList();
		System.out.println(data2);
		
		Map<String, Integer> data3 = data.stream().filter(st->st.getScore()>70)
		.collect(Collectors.toMap(st2->st2.getName(), st2->st2.getScore()));
		System.out.println(data3);
	}

	private static void f19() {
		ShinhanStudent[] arr = {
				new ShinhanStudent("A",100),
				new ShinhanStudent("E",60),
				new ShinhanStudent("C",70),
				new ShinhanStudent("B",90),
				new ShinhanStudent("D",80),
		};
		List<ShinhanStudent> data = Arrays.asList(arr);
		int sum1 = data.stream().mapToInt(st->st.getScore()).sum();
		int sum2 = data.stream().mapToInt(st->st.getScore()).reduce(0, (a,b) -> a+b);
		System.out.println(sum1 + sum2);
	}

	private static void f18() {
		List<Integer> list = new ArrayList<Integer>();
		OptionalDouble opDouble = list.stream().mapToInt(Integer::intValue).average();
		if(opDouble.isPresent()) {
			System.out.println("방법1_평균: " + opDouble);
		}else {
			System.out.println("방법1_평균: " + 0.0);
		}
		
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2_평균: " + avg);
		
		list.stream().mapToInt(s -> s.intValue()).average().ifPresent(a -> System.out.println(a));
	}

	private static void f17() {
		int[] arr = {100,50,20,40,60};
		long count = Arrays.stream(arr).filter(s->s>=50).count();
		System.out.println(count);
		
		OptionalDouble opDouble = Arrays.stream(arr).average();
		if(opDouble.isPresent()) {
			double result = opDouble.getAsDouble();
			System.out.println(result);
		}
	}

	private static void f16() {
		int[] arr = {100,50,20,40,60};
		boolean result =Arrays.stream(arr).allMatch(s -> s>=20);
		boolean result2 =Arrays.stream(arr).anyMatch(s -> s<=0);
		boolean result3 =Arrays.stream(arr).noneMatch(s -> s<20);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

	private static void f15() {
		int[] arr = {100,50,60,20,80};
		
		int result =Arrays.stream(arr) //original stream
		.peek(s->System.out.println(s)) //중간
		.sum();
		System.out.println(result);
		
		Arrays.stream(arr) //original stream
		.forEach(s->System.out.println(s)); //최종
	}

	private static void f14() {
		ShinhanStudent[] arr = {
				new ShinhanStudent("A",100),
				new ShinhanStudent("E",60),
				new ShinhanStudent("C",70),
				new ShinhanStudent("B",90),
				new ShinhanStudent("D",80),
		};
		List<ShinhanStudent> data = Arrays.asList(arr);
		data.stream().sorted((a,b) -> a.getName().compareTo(b.getName()))//.sorted()
		.forEach(st->System.out.println(st));
	}

	private static void f13() {
		List<String> alist = Arrays.asList("10, 20, 30","40, 50");
		alist.stream().flatMapToInt(s->{
			String[] strArr = s.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		})
		.forEach(a->System.out.println(a));
	}

	private static void f12() {
		List<String> alist = new ArrayList<>();
		alist.add("this is java");
		alist.add("i am a best developer");
		
		alist.stream().flatMap(s->Arrays.stream(s.split(" ")))
		.forEach(s -> System.out.println(s));
	}

	private static void f11() {
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr).asDoubleStream()//.boxed()
		.forEach(i->System.out.println(i));
	}

	private static void f10() {
		ShinhanStudent[] arr = {
				new ShinhanStudent("A",100),
				new ShinhanStudent("B",60),
				new ShinhanStudent("C",70),
				new ShinhanStudent("D",90),
				new ShinhanStudent("E",80),
		};
		List<ShinhanStudent> data = Arrays.asList(arr);
		data.stream().mapToInt(st->st.getScore()).filter(score->score>=80)
		.forEach(s->System.out.println(s));
	}

	private static void f9() {
		List<Integer> alist = List.of(100,90,50,60,20,50);
		alist.stream().distinct().filter(s-> s>=80).forEach(s -> System.out.println(s));
	}

	private static void f8() {
		List<String> alist = List.of("1월","2화","2수","2목","1금","1월","1화","1수","1목","2금");
		alist.stream().distinct().filter(s->s.startsWith("2")).forEach(s->System.out.println(s));
	}

	private static void f7() throws URISyntaxException, IOException {
		//getResource()는 src가 아닌 bin에서 가져옴 (.class)
		Class cls = StreamTest.class;
		Path path = Paths.get(cls.getResource("data.txt").toURI());
		Stream<String> st = Files.lines(path);
		st.forEach(s->{
			System.out.println(s);
		});
	}

	static int sum=0;
	private static void f6() {
		//1~10
		IntStream.rangeClosed(1, 10).forEach(i->{
			//람다표현식 -> 익명구현class로 변경한다. 메소드내에 있어 local class이다.
			//local class는 지역변수를 변경할 수 없다. 접근만 가능(final)
			sum+=i;
			});
		System.out.println("합계: " +sum);

	}

	private static void f5() {
		ShinhanStudent[] arr = {
				new ShinhanStudent("A",100),
				new ShinhanStudent("B",60),
				new ShinhanStudent("C",70),
				new ShinhanStudent("D",90),
				new ShinhanStudent("E",80),
		};
		List<ShinhanStudent> data = Arrays.asList(arr);
		double avg = data.stream().mapToInt(st->st.getScore()).average().getAsDouble();
		System.out.println(avg);
	}

	private static void f4() {
		List<String> alist = List.of("월","화","수","목","금","월","화","수","목","금");
		alist.stream().forEach(s->{
			System.out.println(Thread.currentThread().getName() + ": " + s);
		});
		alist.parallelStream().forEach(s->{ //병렬 처리
			System.out.println(Thread.currentThread().getName() + ": " + s);
		});
	}

	private static void f3() {
		String[] arr = {"a","b","c","자바"};
		Arrays.stream(arr).forEach(s->System.out.println(s));
	}

	private static void f2() {
		//내부반복자: 스트림
		int[] arr = {10,20,30,40,50};
		//IntConsumer ic = a->{};
		Arrays.stream(arr).forEach(i->System.out.println(i));
	}

	private static void f1() {
		//반복자를 이용하기
		int[] arr = {10,20,30,40,50};
		for(int i:arr) {
			System.out.println(i);
		}
	}
}

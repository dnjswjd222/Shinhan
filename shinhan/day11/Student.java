package com.shinhan.day11;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {

	String stdId;
	String name;
	String major;
	int score;

	@Override
	public int compareTo(Student o) {
		if (o.score == score) {
			if (major.equals(o.major))
				return o.stdId.compareTo(stdId);
			else
				return major.compareTo(o.major);

		}
		return o.score - score;
	}

}

/*
 * 학생이 5명있다. 
 * 조회하면 점수순으로 desc 
 * 같은 점수이면 전공으로 asc 
 * 전공도 같으면 학번으로 desc
 */

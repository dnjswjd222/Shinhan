package com.shinhan.day05.lab;

public class Employee2Exam {

	public static void main(String[] args) {
		double[] bonus = {0.1,0.2,0.3,0.4};
		int index =0;
		Employee2[] arr = new Employee2[4];

		arr[0] = new Employee2("zzilre1", "유채승", 1500000);
		arr[1] = new Employee2("zzilre2", "이재희", 1300000);
		arr[2] = new Employee2("zzilre3", "최다희", 1200000);
		arr[3] = new Employee2("zzilre4", "박채원", 1000000);

		for (Employee2 emp : arr) {
			System.out.println(emp + " 보너스는 " + emp.getSalary(bonus[index++]));
		}
	}

}

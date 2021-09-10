package com.example.studentsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<Student>();
		System.out.println("Student list(oredered by name)");
		
		list.add(new Student(1, "길동", 22));
		list.add(new Student(2, "철수", 12));
		list.add(new Student(3, "훈이", 23));
		list.add(new Student(4, "짱구", 24));
		list.add(new Student(5, "맹구", 22));
		list.add(new Student(6, "짱아", 14));
		list.add(new Student(7, "유리", 32));
		list.add(new Student(8, "흰둥", 34));
		list.add(new Student(9, "봉미선", 44));
		list.add(new Student(10, "신형만", 42));
		
		Collections.sort(list);
		
		for(Student s : list) {
			System.out.println(s.toString());
		}
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Student List (reverse oredered by name)");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}

}

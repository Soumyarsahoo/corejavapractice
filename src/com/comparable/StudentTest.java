package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student student1 = new Student(8, "akhilesh");
		Student student2 = new Student(10, "bhabesh");
		Student student3 = new Student(8, "john");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		//sort by comparable
//		Collections.sort(list);
		
		Collections.sort(list,new StudentIdComparator());
		System.out.println(list);
	}

}

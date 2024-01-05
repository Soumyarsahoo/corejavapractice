package com.faifast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {

	public static void main(String[] args) {
		List<Integer> intList = new CopyOnWriteArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);

		System.out.println(intList);

		Iterator<Integer> itr = intList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			intList.add(10);
		}

//		for(Integer i:intList) {
//			System.out.println(i);
//			intList.add(10);
//		}

//		for (int i = 0; i < intList.size(); i++) {
//			System.out.println(intList.get(i));
//			intList.add(10);
//		}
		System.out.println(intList);
	}

}

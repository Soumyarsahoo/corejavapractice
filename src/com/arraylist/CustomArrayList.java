package com.arraylist;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {

	public boolean add(Object o) {
		if (this.contains(o)) {
			return true;
		} else {
			return super.add(o);
		}
	}

	public static void main(String[] args) {
		CustomArrayList ca = new CustomArrayList();
		ca.add("A");
		ca.add("A");
		ca.add("B");
		System.out.println(ca);
	}
}

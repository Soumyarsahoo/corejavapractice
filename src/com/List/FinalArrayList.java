package com.List;

import java.util.ArrayList;

public class FinalArrayList {
	
	public static void main(String[] args) {
		final ArrayList<String> arr = new ArrayList<>();
		//we can manipulate the arraylist.
		arr.add("A");
		arr.add("B");
		arr.add("C");
		System.out.println(arr);
		
		//We can not assign a new object to this reference.
		//arr = new ArrayList<>();
	}

}

package com.faifast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {
	
	public static void main(String[] args) {
		Map< Integer, Integer> hm = new ConcurrentHashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(3, 40);
		
		Iterator<Integer> itr = hm.values().iterator();
		while(itr.hasNext()) {
//			hm.put(3, 30);
			System.out.println(itr.next());
		}
		
//	Set<Integer> s = hm.keySet();
//	s.stream().forEach(System.out::println);
	}

}

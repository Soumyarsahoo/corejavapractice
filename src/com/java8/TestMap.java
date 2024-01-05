package com.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("s", 10);
		map.put("l", 00);
		map.put("n", 50);
		map.put("u", 30);
		map.put("r", 20);
		map.put("p", 80);
		map.put("q", 40);

		// sort the map based on value in descending order
		LinkedHashMap<String, Integer> collect = map.entrySet().stream().
				sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldVal,newVal)->oldVal,LinkedHashMap::new));

		System.out.println("collect: " + collect);

		// Get Second highest value
		Integer secondHighestVal = map.entrySet().stream().map(e -> e.getValue()).sorted(Comparator.reverseOrder())
				.limit(2).skip(1).findFirst().get();
		System.out.println("secondHighestVal: " + secondHighestVal);
	}

}

//map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldVal,newVal)->oldVal,LinkedHashMap::new));

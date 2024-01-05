package com.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStringStreams {
	
	public static void main(String[] args) {
		String word = "javadeveloper";
		Map<String, Long> occuranceMap = Arrays.stream(word.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("occuranceMap: "+occuranceMap);
	}

}

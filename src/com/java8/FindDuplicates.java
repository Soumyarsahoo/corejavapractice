package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find duplicate chars from string
public class FindDuplicates {
	
	public static void main(String[] args) {
		String s = "javadeveloper";
		
//		Map<String, Long> collect =
				List<String> duplicateChars = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1)
		.map(e->e.getKey()).collect(Collectors.toList());
				
				System.out.println("duplicateChars: "+duplicateChars);
	}

}

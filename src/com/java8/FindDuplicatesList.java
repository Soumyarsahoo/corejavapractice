package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesList {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10, 20, 30, 30, 50);

		List<Integer> duplicateIntList = intList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println("duplicateIntList: " + duplicateIntList);
	}

}

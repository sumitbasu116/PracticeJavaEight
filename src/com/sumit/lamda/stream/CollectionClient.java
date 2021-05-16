package com.sumit.lamda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionClient {
	public static void main(String[] args) {
//		List<String> listWithDuplicates = Arrays.asList("a", "c", "d", "bb");
		List<Employee> listWithDuplicates = Arrays.asList(new Employee("Sumit"),new Employee("Amit"));
		listWithDuplicates.stream().forEach((s)->s.setName(s.getName().toUpperCase()));
//		Map<String, Integer> collect = listWithDuplicates.stream().collect(Collectors.toMap(e -> e, String::length));
		System.out.println(listWithDuplicates);

	}
}
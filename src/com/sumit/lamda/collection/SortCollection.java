package com.sumit.lamda.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortCollection {

	public static void main(String[] args) {
		Integer a[]= {23,12,32,55,10,7,18};
		List<Integer> intList = Arrays.asList(a);
		
//		intList.sort((c1,c2) -> {
//			System.out.println("line 1");
//			return c1>c2?1:c1<c2?-1:0;
//				});
		IntStream mapToInt = intList.stream().mapToInt(e -> {
			System.out.println("line1");
		return e * 2;
		});
		
//		intList.forEach((l)->
//		{	System.out.println("line 2");
//			System.out.println(l);
//		});
		//LAZY evaluation proof: removing the below line makes line 17-20 not executable
		mapToInt.forEach(System.out::println);
		
	}
}
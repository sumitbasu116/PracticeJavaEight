package com.sumit.program.practice;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationClient {

	public static void main(String[] args) {
		String stPer = "abc";
		Set<String> permSet=new HashSet<>();
		Set<String> permuResult = permutationString(stPer.toCharArray(),0,permSet);
		permuResult.forEach(System.out::println);
	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	private static Set<String> permutationString(char[] ch, int currentIndex,Set<String> permSet) {
		
		if (currentIndex == ch.length - 1) {
			permSet.add(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutationString(ch, currentIndex + 1,permSet);
			swap(ch, currentIndex, i);
		}
		return permSet;
	}

}

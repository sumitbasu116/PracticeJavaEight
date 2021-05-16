package com.sumit.program.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Input1: {20,10,100,30,50}
 * Input2: 1000
 * find out the pair of two elements from Input1 array which will produce the Input2 value.
 * e.g. {10,100}, {20,50} will generate 1000 if we multiply the pairs
 */
public class PairClientTest {
	public static void main(String[] args) {
		int[] inputArr = { 20, 10, 100, 30, 50 };
		int key = 1000;

		findPairElements(inputArr, key);
	}
	private static void findPairElements(int[] inputArr, int key) {
		Set<Integer> inputSet=new HashSet<>();
		for(int e:inputArr)
			inputSet.add(e);
		
		Map<Pair,Pair> mapResult=new HashMap<>();
		for(Integer ele:inputSet)
		{
			if(inputSet.contains(key/ele)) {
				Pair pair=new Pair(ele, key/ele);
				mapResult.put(pair, pair);
			}
		}
		mapResult.forEach(
				(pair1,pair2)->System.out.println("{"+pair1.getVal1()+","+pair1.getVal2()+"}")
				);
	}
}
class Pair
{
	private Integer val1;
	private Integer val2;
	public Integer getVal1() {
		return val1;
	}
	public void setVal1(Integer val1) {
		this.val1 = val1;
	}
	public Integer getVal2() {
		return val2;
	}
	public void setVal2(Integer val2) {
		this.val2 = val2;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		return prime*(this.val1+this.val2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if((other.getVal1().equals(val2)&&other.getVal2().equals(val1))
				||(other.getVal1().equals(val1)&&other.getVal2().equals(val2)))
			return true;
		return false;
			
	}
	public Pair(Integer val1, Integer val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}
}

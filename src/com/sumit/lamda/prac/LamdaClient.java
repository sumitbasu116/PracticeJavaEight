package com.sumit.lamda.prac;

public class LamdaClient {

	public static void main(String[] args) {
		
		PracSamInter samInter = (a)->a;
		
		System.out.println(samInter.methodReturn(14));
	}
}

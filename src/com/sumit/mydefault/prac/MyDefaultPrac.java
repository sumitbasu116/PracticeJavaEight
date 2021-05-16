package com.sumit.mydefault.prac;

public interface MyDefaultPrac {

	public default void display(String mesg)
	{
		System.out.println(mesg);
	}
}

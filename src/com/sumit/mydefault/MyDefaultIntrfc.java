package com.sumit.mydefault;

public interface MyDefaultIntrfc {

	public default void show(String msg)
	{
		System.out.println(msg);
	}
}

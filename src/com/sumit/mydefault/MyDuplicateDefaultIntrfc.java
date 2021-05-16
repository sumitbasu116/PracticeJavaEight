package com.sumit.mydefault;

public interface MyDuplicateDefaultIntrfc {

	public default void show(String msg)
	{
		System.out.println(msg);
	}
}

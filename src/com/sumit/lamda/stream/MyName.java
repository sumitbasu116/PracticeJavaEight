package com.sumit.lamda.stream;
public class MyName {
	private String name;
	public void toUpperCase()
	{
		this.name=name.toUpperCase();
	}
	public MyName(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

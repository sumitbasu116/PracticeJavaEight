package com.sumit.lamda;

public class MultiOpsClass {

	public void print(String msg)
	{
		System.out.println("Hello "+msg);
	}
	
	public String fetchName(int p)
	{
		if(p==1)
			return "Sumit";
		else if(p==2)
			return "Sumi";
		return "Default";
	}
	
	public boolean isMale(int p)
	{
		if(p==1)
			return true;
		return false;
	}
	public boolean isFeMale(int p)
	{
		if(p==0)
			return true;
		return false;
	}
	public String fetchGreetingMsg()
	{
		return "Hello There";
	}
}

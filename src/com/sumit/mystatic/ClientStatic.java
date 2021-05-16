package com.sumit.mystatic;

public class ClientStatic {

	public static void main(String[] args) {
		
		StaticIntrfcImpl intrfcImpl2=new StaticIntrfcImpl();
		
		MyStaticInterface.display("I am Static ==> not inheritable");
	}
}

package com.spb;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		String msg = helloWorld.greeting();
		System.out.println(msg);

	}
	public String greeting() {
		return "Hello World";
	}

}

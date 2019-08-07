package com.javaMainMethod;

public class HelloWorld {
	public static void main(String[] args) {
		int number = 10;
		number = number++ + ++number;
		System.out.println(number);
		System.out.println("Hello World !!");
	}
}

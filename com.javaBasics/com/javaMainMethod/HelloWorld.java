package com.javaMainMethod;

/*
 * public class HelloWorld { public static void main(String[] args) { int number
 * = 10; number = number++ + ++number; System.out.println(number);
 * System.out.println("Hello World !!"); } }
 */

public class HelloWorld {
	public static void main(String args[]) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a < c);// false && true = false
		System.out.println(a < b & a < c);// false & true = false
	}
}
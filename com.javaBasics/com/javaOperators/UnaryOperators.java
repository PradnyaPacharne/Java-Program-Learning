package com.javaOperators;

public class UnaryOperators {
	static int num1 = 10;
	int num2 = 20;

	public static void main(String... args) {
		int num1 = 10, num2 = 20;
		int result = 0;
		/*
		 * System.out.println(num1++);// 10 System.out.println(num1);
		 * System.out.println(num1++); System.out.println(++num1);
		 * System.out.println(num2--); System.out.println(num2);
		 * System.out.println(num2--); System.out.println(--num2);
		 */
		result = --num2 + num2--;
		System.out.println(result);
		System.out.println(num2--);
		System.out.println(num2);

	}

}

package com.javaOperators;

public class LogicalOperators {
	int num1 = 05, num2 = 04;

	/*
	 * public void logicalOrOperator() { System.out.println(num2++); if (++num1 <=
	 * num2++ || ++num1 >= num2++) { System.out.println("False"); } else if (++num1
	 * >= num2++ || num2++ >= ++num1) { System.out.println("True"); }
	 * System.out.println(num1); // 5 6 System.out.println(num2); // 5 5 }
	 */

	public void logicalAndOpeartor() {
		System.out.println(num2 += 1);
		System.out.println(num1--);
		if (num1-- >= --num2 && num1-- >= --num2) {
			System.out.println("False");
		} else if (--num1 <= --num2 && --num2 >= num1--) {
			System.out.println("True");
		}
		System.out.println(num1);// 3
		System.out.println(num2);// 3
	}

	public static void main(String... args) {
		LogicalOperators lo = new LogicalOperators();
		// lo.logicalOrOperator();
		lo.logicalAndOpeartor();
	}
}

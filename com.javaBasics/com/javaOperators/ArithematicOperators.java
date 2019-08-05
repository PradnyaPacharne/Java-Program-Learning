package com.javaOperators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithematicOperators {
	int a, b;

	void operation(int num1, int num2) {
		System.out.println("Number One: " + num1);
		System.out.println("Number Two: " + num2);
		System.out.println("Addition is: " + (num1 + num2));
		System.out.println("Subtraction is: " + (num1 - num2));
		System.out.println("Multiplication is: " + (num1 * num2));
		System.out.println("Division is: " + (num1 / num2));
		System.out.println("Modulo is: " + (num1 % num2));
	}

	public static void main(String... args) throws InputMismatchException{
		System.out.print("Enter the numbers");
		Scanner scan = new Scanner(System.in);
		ArithematicOperators obj = new ArithematicOperators();
		obj.operation(scan.nextInt(), scan.nextInt());
		
		  try { obj.operation(scan.nextInt(), scan.nextInt()); } 
		  catch (Exception e) { e.printStackTrace(); }
		 
		scan.close();

	}
}

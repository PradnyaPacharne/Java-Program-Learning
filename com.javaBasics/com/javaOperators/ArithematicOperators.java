package com.javaOperators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithematicOperators {
	int choice;

	void intOperation(int num1, int num2) {
		System.out.println("Number One: " + num1);
		System.out.println("Number Two: " + num2);
		System.out.println("Addition is: " + (num1 + num2));
		System.out.println("Subtraction is: " + (num1 - num2));
		System.out.println("Multiplication is: " + (num1 * num2));
		System.out.println("Division is: " + (num1 / num2));
		System.out.println("Modulo is: " + (num1 % num2));
	}

	void floatOperation(float num1, float num2) {
		System.out.println("Number One: " + num1);
		System.out.println("Number Two: " + num2);
		System.out.println("Addition is: " + (num1 + num2));
		System.out.println("Subtraction is: " + (num1 - num2));
		System.out.println("Multiplication is: " + (num1 * num2));
		System.out.println("Division is: " + (num1 / num2));
		System.out.println("Modulo is: " + (num1 % num2));
	}

	void doubleOperation(double num1, double num2) {
		System.out.println("Number One: " + num1);
		System.out.println("Number Two: " + num2);
		System.out.println("Addition is: " + (num1 + num2));
		System.out.println("Subtraction is: " + (num1 - num2));
		System.out.println("Multiplication is: " + (num1 * num2));
		System.out.println("Division is: " + (num1 / num2));
		System.out.println("Modulo is: " + (num1 % num2));
	}

	public static void main(String... args) {

		ArithematicOperators obj = new ArithematicOperators();
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Welcome To Pradnya's Calculator !!!");
			System.out.println("For Integer Press 1");
			System.out.println("For Float Press 2");
			System.out.println("For Double Press 3");
			System.out.println("For Exit Press 0");
			System.out.println("Please Enter your choice..");
			obj.choice = scan.nextInt();
			if (obj.choice != 0) {
				switch (obj.choice) {
				case 1:
					System.out.println("Enter Two Integer Numbers..");
					obj.intOperation(scan.nextInt(), scan.nextInt());
					break;
				case 2:
					System.out.println("Enter Two Float Numbers..");
					obj.floatOperation(scan.nextFloat(), scan.nextFloat());
					break;
				case 3:
					System.out.println("Enter Two Double Numbers..");
					obj.doubleOperation(scan.nextDouble(), scan.nextDouble());
					break;
				default:
					System.out.println("Incorrect Choince..");
					break;
				}
			} else {
				System.out.println("Bye ...");
			}
		} while (obj.choice != 0);
		scan.close();

	}
}

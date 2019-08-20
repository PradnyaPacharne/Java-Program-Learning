package ifelsepackage;

import java.util.Scanner;

public class IfElseExample {

	void positive(int numeven) {
		if (numeven>=0) {
			System.out.println("The given num "+numeven+"is positive" );	
		}
		else {
			System.out.println("The given num "+numeven+"is negative");
		}
	}

	public static void main(String[] args) {
		int num1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter num");
		num1 = scan.nextInt();
		new IfElseExample().positive(num1);
	}
}

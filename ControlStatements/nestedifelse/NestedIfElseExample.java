package nestedifelse;

import java.util.Scanner;

public class NestedIfElseExample {
	
	void calculation(int marks) {
		if (marks<=35 || marks<=45) {
			System.out.println("Pass");
		}
		else if (marks<=46 || marks<=55) {
			System.out.println("Avg");
		}
		else if (marks<=56 || marks<=75) {
			System.out.println("Good");
		}
		else if (marks<=76 || marks<=100) {
			System.out.println("Excellent");
		}
	}
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter marks");
		number = scan.nextInt();
		if(number>=0 && number <= 100) {
			new NestedIfElseExample().calculation(number);
		}
		else 
			System.out.println("You have entered incorrect number");
}
}

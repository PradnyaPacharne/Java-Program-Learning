package nestedswitch;

import java.util.Scanner;

public class NestedSwitchExample {
	void display(int number, Scanner scan) {
		int no1, no2, choice;
		switch (number) {
		case 1:
			System.out.println("Welcome to Cal");
			System.out.println("please enter 2 no and 1 choice");
			no1 = scan.nextInt();
			no2 = scan.nextInt();
			choice = scan.nextInt();
			switch (choice) {
			default:
				System.out.println("Your choice is not matching");
				break;
			case 1:
				System.out.println("addition is" + (no1 + no2));
				break;
			case 2:
				System.out.println("subtraction" + (no1 - no2));
				break;
			case 3:
				System.out.println("multiplication" + (no1 * no2));
				break;
			case 4:
				System.out.println("divisio" + (no1 / no2));
				break;
			case 5:
				System.out.println("modulo" + (no1 % no2));
				break;
			}
			break;
		case 2:
			System.out.println("Welcome to Square & Cube");
			System.out.println("please enter 2 no");
			no1 = scan.nextInt();
			no2 = scan.nextInt();
			System.out.println("Square of num1" + (no1 * no1));
			System.out.println("Square of num2" + (no2 * no2));
			System.out.println("Cube of num1" + (no1 * no1 * no1));
			System.out.println("Cube of num2" + (no2 * no2 * no2));
			break;
		case 3:
			System.out.println("Welcome to Square root");
			System.out.println("please enter 2 no");
			no1 = scan.nextInt();
			no2 = scan.nextInt();
			System.out.println("Square root of 1st num1" + Math.sqrt(no1));
			System.out.println("Square root of 1st num1" + Math.sqrt(no2));
			break;
		case 4:
			System.out.println("Cube Root");
			System.out.println("please enter 2 no");
			no1 = scan.nextInt();
			no2 = scan.nextInt();
			System.out.println("Square root of 1st num1" + Math.cbrt(no1));
			System.out.println("Square root of 1st num1" + Math.cbrt(no2));
			break;
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		num = scan.nextInt();
		if (num >= 1 && num <= 4) {
			new NestedSwitchExample().display(num, scan);
		}
	}
}

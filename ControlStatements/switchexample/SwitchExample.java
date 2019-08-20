package switchexample;

import java.util.Scanner;

public class SwitchExample {

	void season(int monthly) {
	switch(monthly) {
	case 1:
	case 2:
	case 3:
	case 4:
		System.out.println("Summer");
		break;
	case 5:
	case 6:
	case 7:
	case 8:
		System.out.println("Rainy");
		break;
	case 9:
	case 10:
	case 11:
	case 12:
		System.out.println("Winter");
		break;
		default: System.out.println("No month");
	}
	}
	public static void main(String[] args) {
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number");
		month = scan.nextInt();
		/*
		 * if (month>=1 && month<=12) { new SwitchExample().season(month); } else
		 * System.out.println("Month missing");
		 */
		new SwitchExample().season(month);
	}
}

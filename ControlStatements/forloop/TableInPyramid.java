package forloop;

import java.util.Scanner;

public class TableInPyramid {

	void calculation(int number) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number * j + " ");
			}
			System.out.println();
		}
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(number * j + " ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println("Please enter number..");
		int number = new Scanner(System.in).nextInt();
		new TableInPyramid().calculation(number);
	}
}

package forloop;

import java.util.Scanner;

public class ForEachExample {
	void display(String b[]) {
		for (String i : b) {
			System.out.println("Array " + i);
		}
	}

	public static void main(String[] args) {
		String a[] = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextLine();
		}
		new ForEachExample().display(a);
	}
}

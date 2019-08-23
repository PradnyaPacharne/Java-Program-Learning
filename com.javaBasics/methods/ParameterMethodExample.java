package methods;

import java.util.Scanner;

public class ParameterMethodExample {
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
public static void main(String[] args) {
	int no1, no2;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number1");
	System.out.println("Enter number 2");
	no1 = scan.nextInt();
	no2 = scan.nextInt();
	new ParameterMethodExample().add(no1, no2);
}
}

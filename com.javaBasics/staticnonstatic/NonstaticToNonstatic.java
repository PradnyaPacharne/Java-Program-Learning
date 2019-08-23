package staticnonstatic;

import java.util.Scanner;

public class NonstaticToNonstatic {
 
	 void add(int no1, int no2) {
		int result = no1+no2;
		sub();
	}
	
	void sub() {
		System.out.println("This is sub method");
	}
	
	public static void main(String[] args) {
		int a, b;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter num1");
	System.out.println("Enter no2");
	a = scan.nextInt();
	b = scan.nextInt();
	new NonstaticToNonstatic().add(a, b);
}
}

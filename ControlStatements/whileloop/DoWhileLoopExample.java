package whileloop;

import java.util.Scanner;

public class DoWhileLoopExample {
	
	void Calculator(Scanner scan) {
		int num;
		do {
			System.out.println("Welcome to cal"); 
			System.out.println("1. Press 1 to add ");
			System.out.println("2. Press to sub ");
			System.out.println("3. Press 0 to exit");
			System.out.println("Please enter num");
			num = scan.nextInt();
		}while(num!=0);
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	new DoWhileLoopExample().Calculator(scan);
	
}
}

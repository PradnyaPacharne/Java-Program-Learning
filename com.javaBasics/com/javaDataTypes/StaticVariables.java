package com.javaDataTypes;
import java.util.Scanner;

public class StaticVariables {
	static String compName="Benchmark";
	String empName;
	
	public static void main(String args[]) {
		System.out.print("Please enter Employee Name");
		StaticVariables obj = new StaticVariables();
		Scanner scan = new Scanner(System.in);
		obj.empName= scan.nextLine();
		scan.close();
		System.out.println("Company name"+compName);
		System.out.println("Employee name"+obj.empName);
	}

}

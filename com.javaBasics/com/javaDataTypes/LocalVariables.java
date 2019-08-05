package com.javaDataTypes;

public class LocalVariables {

	 void display() {
		 
		 	byte byByte=0;
			short shShort=0;
			int iInt=0;
			long lLong=0;
			char cChar='c';
			String sString="Pradnya";
			float fFloat=0.0f;
			double dDouble=5;
			boolean bBoolean=false;
			System.out.println("Default value of byte: " + byByte);
			System.out.println("Default value of short: " + shShort);
			System.out.println("Default value of int: " + iInt);
			System.out.println("Default value of long: " + lLong);
			System.out.println("Default value of char: " + cChar); // Default value is:‘\u0000’
			System.out.println("Default value of String: " + sString);
			System.out.println("Default value of float: " + fFloat);
			System.out.println("Default value of double: " + dDouble);
			System.out.println("Default value of boolean: " + bBoolean);
	 }
	 public static void main(String[] args) {
		 LocalVariables Obj = new LocalVariables();
			Obj.display();
		}
}

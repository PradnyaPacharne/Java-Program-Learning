package com.javaDataTypes;

public class DefaultValuesOfDataTypes {

	byte byByte;
	short shShort;
	int iInt;
	long lLong;
	char cChar;
	String sString;
	float fFloat;
	double dDouble;
	boolean bBoolean;

	void display() {
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
		DefaultValuesOfDataTypes Obj = new DefaultValuesOfDataTypes();
		Obj.display();
	}

}

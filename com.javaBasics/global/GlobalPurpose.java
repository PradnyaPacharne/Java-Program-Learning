package global;

import java.util.Scanner;

public class GlobalPurpose {
	Scanner scan;
	
	public GlobalPurpose(){
		scannerMethod();
	}
	public Scanner scannerMethod() {
	scan = new Scanner(System.in);
	return scan;
	}
	
}

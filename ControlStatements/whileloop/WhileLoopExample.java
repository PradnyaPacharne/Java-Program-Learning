package whileloop;
import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		int i = 0;
		int n;
		global.GlobalPurpose obj = new global.GlobalPurpose();
		System.out.println("Please enter a num");
		n = obj.scannerMethod().nextInt();
		while (i <= n) {
			System.out.println(i);
			i++;
		}
	}
}

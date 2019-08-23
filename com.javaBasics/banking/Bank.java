package banking;

import java.util.Scanner;

public class Bank {
	static int count = 1;

	private void display(String name, String addr, String pan) {
		System.out.println("Customer name=" + name);
		System.out.println("Customer address=" + addr);
		System.out.println("Customer PAN=" + pan);
	}

	private String account_Num_Generation(String panno) {
		String acc_no;
		acc_no = panno + count + "";
		count++;
		return acc_no;
	}

	private void currentBalanceCheck(Scanner scan) {
		double acc;
		do {
			System.out.println("Please enter balance: ");
			acc = scan.nextDouble();
			if (acc >= 5000) {
				break;
			} else
				System.out.println("Minimum Balance should be 5000");
		} while (acc != 5000);
	}
	public void cust_New() {
		String cust_name, cust_addr, pan_no;
		System.out.println("Enter the customer name");
		cust_name = obj.scannerMethod().nextLine();
		System.out.println("Enter the customer address");
		cust_addr = obj.scannerMethod().nextLine();
		System.out.println("Enter the customer pan no");
		pan_no = obj.scannerMethod().nextLine();
		
	}
	public void exist_Cust() {
		
	}
	
	public static void main(String[] args) {

		int choice;
		global.GlobalPurpose obj = new global.GlobalPurpose();
		Bank bank = new Bank();
		
		//bank.display(cust_name, cust_addr, pan_no);
		//bank.account_Num_Generation(pan_no);
		System.out.println("Please enter choice:");
		/*
		 * do {
		 * 
		 * }while(choice!=0);
		 */
		//System.out.println("customer acc num=" + bank.account_Num_Generation(pan_no));
		bank.currentBalanceCheck(obj.scannerMethod());

	}
}

package Practiseproblems;

import java.util.Scanner;

public class AccountDetails {

	public static void main(String[] args) {
		while (true) {
		System.out.println("\nPlease Select what you want to do");
		System.out.println("\nPress 1 > for view  your Current Balance");
		System.out.println("Press 2 > for add Balance");
		System.out.println("Press 3 > for Withdraw Balance");

		AccountInformation account = new AccountInformation();
		
		Scanner scanner = new Scanner(System.in);
		int press = scanner.nextInt();
		
			switch (press) {
			case 1:
				account.view();
				break;
			case 2:
				account.addbalance();
				break;
			case 3:
				account.withdraw();
				break;
			}
		}
	}

}
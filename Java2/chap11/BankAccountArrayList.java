package chap11;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountArrayList {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("How many bank accounts do you have? ");
			int numAccounts = scan.nextInt();
			
			ArrayList<BankAccount> list = new ArrayList<BankAccount>(numAccounts);
			/*
			System.out.print("Enter amount in each account one by one: ");
			for(int i=0; i < numAccounts; i++) {
				try {
					list.add(new BankAccount(scan.nextDouble()));
				} catch (NegativeStartingBalance e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			double total=0;
			for (int i=0; i<list.size(); i++) {
				BankAccount account = list.get(i);
				total += account.getBalance();
				System.out.printf("Account %d has $%.2f\n", i,account.getBalance());
			}
			System.out.printf("Total is $%.2f\n", total);*/
		}

}

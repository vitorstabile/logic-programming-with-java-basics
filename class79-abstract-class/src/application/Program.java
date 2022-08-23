package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
			/* Account acc1 = new Account(1001, "Alex", 1000.0); */ /* you can't instance account */
		
			Locale.setDefault(Locale.US);
		
			Account acc2 = new SavingsAccount(1001, "Alex", 500.0, 0.01);
			Account acc3 = new BusinessAccount(1002, "Maria", 1000.0, 400.0);
			Account acc4 = new SavingsAccount(1004, "Bob", 300.0, 0.01);
			Account acc5 = new BusinessAccount(1005, "Anna", 500.0, 500.0);
			
			List<Account> list = new ArrayList<>();
			
			list.add(acc2);
			list.add(acc3);
			list.add(acc4);
			list.add(acc5);
			
			double sum = 0.0;
			for (Account acc : list) {
				sum += acc.getBalance();
			}
			
			System.out.printf("Total balance: %.2f%n", sum);
			
			for (Account acc : list) {
				acc.deposit(10.0);
			}
			
			for (Account acc : list) {
				System.out.printf("Updated balance ofr account %d: %.2f%n", acc.getNumber(), acc.getBalance());
			}
			
	}

}

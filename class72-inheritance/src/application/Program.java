package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount();
		
		double amount = 20.0;
		
		account.deposit(amount);
		

	}

}

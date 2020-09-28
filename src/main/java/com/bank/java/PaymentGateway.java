package com.bank.java;

public class PaymentGateway {
	//method to transfer the given amount from the src to target account.
		public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount) 
		{
			if(sender.getBalance()>amount) {
				try {					
					sender.withdraw(amount);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				reciever.deposit(amount);
				return true;
			}
			else
			{
				System.out.println("Not enough balance");
                 return false;
			}
		}
}

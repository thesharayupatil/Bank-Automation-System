package theshypatil.com;

import java.time.LocalDate;
import java.util.Scanner;


public class SalaryAccount extends SavingAccount{
	LocalDate last_transaction_date;
	 boolean freezeStatus = false;
	 
	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}
	public SalaryAccount(int accNo, String accHolderName, double balance,LocalDate openDate,double minbalance,double interestRate,LocalDate last_transaction_date) {
		super( accNo, accHolderName, balance, openDate,minbalance,interestRate);
		this.last_transaction_date = last_transaction_date;
		
	}
	public LocalDate getLast_transaction_date() {
		return last_transaction_date;
	}
	public void setLast_transaction_date(LocalDate last_transaction_date) {
		this.last_transaction_date = last_transaction_date;
	}
	
	
	
	public void calculateInterest()
	{
		double result = (balance * interestRate) / 100;
       System.out.println("Interest calculated: " + result);
	}
	
	
	public void deposite(double amount)
	{
		freez_Status();
		if(freezeStatus)
		{
			 balance+=amount;
			 System.out.println("Diposite Succesfully");
		}
		else
		{
			System.out.println("Account Freeze\n\n");
			unfreezeAccount();
           
		}
	   
	}
	public void withdraw(double amount)
	{
		freez_Status();
	
		if(freezeStatus)
		{
			if(balance-amount >= minbalance)
			{
				balance-=amount;
			    System.out.println("Withdraw Succesfully");
			}
			else
			{
			    System.out.println("Insufficient balance");
			}
		}
		else
		{
			System.out.println("Account Freeze");
			unfreezeAccount();
		}
		
	}

	public boolean freez_Status()
	{
		LocalDate currentDate = LocalDate.now();
       LocalDate twoMonthsAgo = currentDate.minusMonths(2);
       last_transaction_date.isAfter(twoMonthsAgo);
       return false;
	}
	public void unfreezeAccount() {
       System.out.println("Do you want to unfreeze your account?");
       System.out.println("Enter 1 to unfreeze:");
       try (Scanner scanner = new Scanner(System.in)) {
		int choice = scanner.nextInt();
		   if (choice == 1) {
		       freezeStatus = true;
		       System.out.println("Your account has been unfrozen. You can now make transactions.");
		   }
	}
	}
}
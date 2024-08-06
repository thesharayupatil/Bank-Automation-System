package theshypatil.com;

import java.time.LocalDate;

public class CurrentAccount extends Account{
	
	double overdraft_limit ;

	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(int accNo, String accHolderName, double balance,LocalDate openDate, double overdraft_limit) {
		super(accNo,accHolderName,balance,openDate);
		this.overdraft_limit = overdraft_limit;
	}
	public double getOverdraft_limit() {
		return overdraft_limit;
	}
	public void setOverdraft_limit(double overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}
	public void deposite(double amount)
	{
	    balance+=amount;
	    System.out.println("Diposite Succesfully");
	}
	public void withdraw(double amount)
	{
		if(balance+overdraft_limit >= amount)
		{
			balance-=amount;
			System.out.println("Withdraw Succesfully");
			System.out.println(balance);
		}
		else
		{
			System.out.println("Exceeded Overdraft Limit");
		}
		
	}
	@Override
	public void calculateInterest() {
		System.out.println("No Interest Calculations for Current Account");
		
	}
}
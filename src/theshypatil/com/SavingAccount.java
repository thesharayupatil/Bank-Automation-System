package theshypatil.com;
import java.time.LocalDate;
public class SavingAccount extends Account {
	
	double minbalance;
    double interestRate;
	
    
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accNo, String accHolderName, double balance,LocalDate openDate,double minbalance,double interestRate) {
		super(accNo, accHolderName, balance,openDate);
		this.minbalance = minbalance;
		this.interestRate = interestRate;
		
	}

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		if(amount < minbalance)
		{
			System.out.println("Deposit failed. Your account cannot be deposited into because the minimum balance limit is 10000.");
		}
		else
		{
			balance+=amount;
		    System.out.println("Deposite Succesfully");
		}
	} 
	public void withdraw(double amount)
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
	public void calculateInterest()
	{
		double result = (balance * interestRate) / 100;
        System.out.println("Interest calculated: " + result);
	}
}
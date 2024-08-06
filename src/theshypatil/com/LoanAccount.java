package theshypatil.com;

import java.time.LocalDate;
public class LoanAccount extends Account{
	double loan_amount;
	double interest_rate;
	double totalPaid;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}
	public LoanAccount(int accNo, String accHolderName, double balance,LocalDate openDate,double loan_amount, double interest_rate) {
		super(accNo, accHolderName, balance, openDate);
		this.loan_amount = loan_amount;
		this.interest_rate = interest_rate;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public void deposite(double amount) {
		balance+=amount;
		totalPaid-=amount;
	    System.out.println("Diposite Succesfully");
	    System.out.println("Remaining Loan : "+totalPaid);
	    
	    if(totalPaid==0)
	    {
	    	System.out.println("loan Cleared...");
	    }
	}
	
	public void withdraw(double amount) {
		System.out.println("You Cannot withdraw money From Loan Account");
	}
	@Override
	public void calculateInterest() {
		double result = (loan_amount * interest_rate) / 100;
		totalPaid = loan_amount + result;
        System.out.println("Interest calculated: " + result);
	}
	public void display()
	{
		totalPaid = loan_amount + (loan_amount*interest_rate)/100;
		System.out.println("Paid Amount : " + this.balance);
		System.out.println("Total Loan Amoun With Interest : "+totalPaid);
		if(loan_amount==0)
	    {
	    	System.out.println("loan Cleared...");
	    }
	}
	
}
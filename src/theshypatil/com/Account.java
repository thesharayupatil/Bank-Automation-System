package theshypatil.com;
import java.time.LocalDate;
public abstract class Account {
	int accNo;
    String accHolderName;
    double balance;
    LocalDate openDate;
    
    public Account() {
		// TODO Auto-generated constructor stub
	}
    
	public Account(int accNo, String accHolderName, double balance,LocalDate openDate) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.openDate = openDate;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public abstract void deposite(double balance);
	public abstract void withdraw(double balance);
	
	public abstract void calculateInterest();
	
	public void display()
	{ 
//		System.out.println("|-----------------------|------------------------|");
//		System.out.println("|  Account Number       |" +this.accNo + "       |");
//		System.out.println("|  Account Holder Name  |" +this.accHolderName +"|");
//		System.out.println("|  Balance              |" + this.balance+ "     |");
//		System.out.println("|------------------------------------------------|");
		
		System.out.println("|\t"+ accNo +"\t\t|\t"+this.accHolderName+"\t\t\t|\t" +this.balance+"   |");
	}
	
}

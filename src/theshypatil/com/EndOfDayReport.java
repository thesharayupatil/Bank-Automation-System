package theshypatil.com;


import java.time.LocalDate;

public class EndOfDayReport {
	int accNo;
	String process;
	double amount;
	LocalDate reportDate;
	
	public EndOfDayReport() {
		// TODO Auto-generated constructor stub
	}
	public EndOfDayReport(int accNo,String process, double amount,LocalDate reportDate) {
		super();
		this.accNo = accNo;
		this.process = process;
		this.amount = amount;
		this.reportDate = reportDate;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDate getReportDate() {
		return reportDate;
	}
	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}
	public void report()
	{
		System.out.println( accNo +"\t\t\t"+ process + "\t\t\t" + amount + "\t\t" + reportDate);
	}
}
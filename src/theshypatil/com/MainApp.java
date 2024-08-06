package theshypatil.com;


import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Account[] ref = new Account[5];
		EndOfDayReport[] arr = new EndOfDayReport[100];
		
		int ch = 0;
		int ctr = 0,j=0;
		int accNo = 100;
		while(ch!=8)
		{
			System.out.println("+-----------------------------------------------------------------------------+");
			System.out.println("|                                          WELCOME                            |");
			System.out.println("|---------|-------------------------------------------------------------------|");
			System.out.println("|  1.     |           Create New Account                                      |");
		    System.out.println("|  2.     |           Diposite                                                |");
		    System.out.println("|  3.     |           Witdraw                                                 |");
		    System.out.println("|  4.     |           Calculate Interest                                      |");
		    System.out.println("|  5.     |           End Of Day Report                                       |");
		    System.out.println("|  6.     |           Close Bank Account                                      |");
		    System.out.println("|  7.     |           Display Account Info..                                  |");
		    System.out.println("|  8.     |           Exit                                                    |");
		    System.out.println("+---------|-------------------------------------------------------------------+");
		    System.out.println("Enter Choice :");
		    try (Scanner sc = new Scanner(System.in)) {
				ch = sc.nextInt();
				switch(ch)
				{
					case 1 :
					{        
						     System.out.println("|----------------------------------------------|");
						     System.out.println("|              Select Accounts                 |");
				             System.out.println("|--------|-------------------------------------|");
							 System.out.println("|  1.    |    Savings Account                  |");
						     System.out.println("|  2     |    Salary Account                   |");
						     System.out.println("|  3.    |    Loan Account                     |");
						     System.out.println("|  4.    |    Current Account                  |");
						     System.out.println("|  5.    |    Exit                             |");
						     System.out.println("|--------|-------------------------------------|");
						     System.out.println("Enter Choice Which Type Of Account You Want To Open : ");
				    		 ch = sc.nextInt();
				    		 
				    		 switch(ch)
				    		 {
				    		 	case 1 :
				    		 	{
				    		 		System.out.println("*******Saving Account******"); 
				    		 		accNo++;
									System.out.println("Enter Name :");
							        String accHolderName = sc.next();
							        System.out.println("Enter Amount");
							        double balance= sc.nextDouble();
							        LocalDate openDate = LocalDate.now();
							        double minbalance = 10000;
							        double interestRate = 6.7;
							        if(balance < minbalance)
							        {
							        	System.out.println("Your account cannot be deposited into because the minimum balance limit is 10000.");
							        }
							        else
							        {
							        	ref[ctr]= new SavingAccount(accNo,accHolderName,balance,openDate,minbalance,interestRate);
				    			        ctr++;
				    			    
				    			        arr[j] = new EndOfDayReport(accNo,"Create Account",balance,openDate);
				    			        j++;
				    			        System.out.println("WELCOME TO OUR BANK, YOUR SAVING ACCOUNT CREATED SUCCESFULLY");
				    			        
				    			        System.out.println("Your Account NO is "+ accNo);
							        }
							       
				    		 	}
				    		 	break;
				    		 	case 2 :
						    	{
						    		System.out.println("*******Salary Account******");
						    		accNo++;
									System.out.println("Enter Name :");
							        String accHolderName = sc.next();
							        System.out.println("Enter Amount");
							        double balance= sc.nextDouble();
							        LocalDate openDate = LocalDate.now();
							        double minbalance = 10000;
							        double interestRate = 6.7;
							        LocalDate last_transaction_date = LocalDate.of(2023, 11, 30);
							        ref[ctr]= new SalaryAccount(accNo,accHolderName,balance,openDate,minbalance,interestRate,last_transaction_date);
							        ctr++;
							        
							        arr[j] = new EndOfDayReport(accNo,"Create Account",balance,openDate);
							        j++;
							        System.out.println("WELCOME TO OUR BANK, YOUR SALARY ACCOUNT CREATED SUCCESFULLY");
							        System.out.println("Your Account NO "+ accNo);
						    	}
						    	break;
						    	case 3 :
						    	{
						    		System.out.println("*******Loan Account******");
						    		accNo++;
									System.out.println("Enter Name :");
							        String accHolderName = sc.next();
									double balance = 0;
							        LocalDate openDate = LocalDate.now();
							        System.out.println("Enter Loan Amount :");
							        double loan_amount = sc.nextDouble();
							    	double interest_rate = 7.8;
							        ref[ctr]= new LoanAccount(accNo,accHolderName,balance,openDate,loan_amount,interest_rate);
   
							        arr[j] = new EndOfDayReport(accNo,"Create Account",loan_amount,openDate);
							        j++;
//		    			        System.out.println("WELCOME TO OUR BANK, YOUR LOAN ACCOUNT CREATED SUCCESFULLY");
							        
							        System.out.println("Your " + loan_amount + " Loan sanctioned");
							        System.out.println("Your Account NO "+ accNo);
							        ref[ctr].display();
//		    			        System.out.println("Paid EMI : "+ ref[ctr].balance);
							        ctr++;       
						    	}
						    	break;
						    	case 4 :
						    	{
						    		System.out.println("*******Current Account******");
						    		accNo++;
									System.out.println("Enter Name :");
							        String accHolderName = sc.next();
							        System.out.println("Enter Amount");
							        double balance= sc.nextDouble();
							        LocalDate openDate = LocalDate.now();
							        double overdraft_limit = 100000 ;

							        ref[ctr]= new CurrentAccount(accNo,accHolderName,balance,openDate,overdraft_limit);
							        ctr++;
							        
							        arr[j] = new EndOfDayReport(accNo,"Create Account",balance,openDate);
							        j++;
							        System.out.println("WELCOME TO OUR BANK, YOUR CURRENT ACCOUNT CREATED SUCCESFULLY");
							        System.out.println("Your Account NO is "+ accNo);
						    	}
						    	break;
						    	case 5 :
						    	{
						    		System.out.println("Exit");
						    	}
						    	break;
						    	default : System.out.println("Invalid Choice");
				    		 }
						 
					}
					break;
					case 2:
					{
				    	System.out.println("Enter Account No : ");
						accNo = sc.nextInt();
						LocalDate openDate = LocalDate.now();
						boolean accountFound = false;
						for(int i=0;i<ctr;i++)
						{
							if(accNo==ref[i].getAccNo())
							{
								System.out.println("Enter Amount : ");
								double amount = sc.nextDouble();
								ref[i].deposite(amount);
								
								arr[j] = new EndOfDayReport(accNo,"Withdraw",amount,openDate);
								j++;
								accountFound = true;
							}
						} 
						if (!accountFound) {
					        System.out.println("Account Not Found");
					    }
					}
					break;
					case 3 :
					{
				    	System.out.println("Enter Account No : ");
				    	LocalDate openDate = LocalDate.now();
						accNo = sc.nextInt();
						boolean accountFound = false;
						for(int i=0;i<ctr;i++)
						{
							if(accNo==ref[i].getAccNo())
							{
								System.out.println("Enter Amount : ");
								double amount = sc.nextDouble();
								ref[i].withdraw(amount);
								
								arr[j] = new EndOfDayReport(accNo,"Withdraw",amount,openDate);
								j++;
								accountFound = true;
							}
						}
						if (!accountFound) {
					        System.out.println("Account Not Found");
					    }

					}
					break;
					case 4 :
					{
						System.out.println("Enter Account No : ");
						accNo = sc.nextInt();
						boolean accountFound = false;
						for(int i=0;i<ctr;i++)
						{
							if(accNo==ref[i].getAccNo())
							{
								ref[i].calculateInterest();
								accountFound = true;
								break;
							}
						}
						if (!accountFound) {
					        System.out.println("Account Not Found");
					    }	
					}
					break;
					case 5:
					{
						System.out.println("This Section is Only For Bank Staff give ID and Password");
						String username = "Bank";
						int password = 12345;
						System.out.println("Enter Id : ");
						String id = sc.next();
						System.out.println("Enter Password :");
						int pass = sc.nextInt();
						
						if(username.equals(id) && password == pass)
						{
							System.out.println("---------------------------------------------------------------------------------------------------");
							System.out.println("Account No \t\t Transaction Process \t\t Amount \t\t Date ");
							System.out.println("---------------------------------------------------------------------------------------------------");
				    		for(int i=0;i<j;i++)
				    		{
				    			arr[i].report();
				    			System.out.println("------------------------------------------------------------------------------------------------");
				    		}
						}
						else
						{
							System.out.println("Something Went Wrong Check Id or Password");
						}
						
					}
					break;
					case 6:
					{
						System.out.println("Enter Account Number to Close Account: ");
					    accNo = sc.nextInt();
					    boolean accountFound = false;
					    
					    for(int i = 0; i < ctr; i++) {
					        if(accNo == ref[i].getAccNo()) {
					            for(int k = i; k < ctr - 1; k++) {
					                ref[k] = ref[k + 1];
					            }
					            ctr--;
					            System.out.println("Account Number " + accNo + " has been closed successfully.");
					            accountFound = true;
					            break;
					        }
					    }
					    
					    if(!accountFound) {
					        System.out.println("Account Not Found");
					    }
						
					}
					break;
					case 7 :
					{
						System.out.println("|-----------------------|-------------------------------|-----------------|");
						System.out.println("|     Account No        |     Account Holder Name       |     Balance     |");
						System.out.println("|-----------------------|-------------------------------|-----------------|");
						for(int i=0;i<ctr;i++)
						{
							ref[i].display();
							System.out.println("|-----------------------|-------------------------------|-----------------|");
						}
					}
					break;
					case 8 :
					{
						System.out.println("Exit");
					}
					break;
					default : System.out.println("Invalid Choice");
					
				}
			}
		    
		}  

	}

}

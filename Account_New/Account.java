import java.lang.*;

public class Account{
	private String AccountHolderName;
	private String AccountNumber;
	private double Balance;
	
	public Account(){
	}
	
	public Account(String AccountHolderName, String AccountNumber, double Balance ){
		this.AccountHolderName=AccountHolderName;
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	
	public void setAll(String AccountHolderName, String AccountNumber, double Balance ){
		this.AccountHolderName=AccountHolderName;
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	
	public void depositCash(double amount){
		this.Balance = this.Balance + amount;
	}
	
	public void withdrawCash(double amount){
		this.Balance = this.Balance - amount;
	}
	
	public void transferCash(Account a, double amount){
		this.Balance = this.Balance - amount;
		a.Balance = a.Balance + amount;
	}
	
	public void Show(){
		System.out.println("Account Holder Name:"+AccountHolderName);
		System.out.println("Account Number:"+AccountNumber);
		System.out.println("Account Balance:"+Balance);
	}
	
}





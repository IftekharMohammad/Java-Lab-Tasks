import java.lang.*;

public class Account{
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	
	public Account(){
		System.out.println("Empty Constructor");
	}
	
	public Account(int x, double y, String z){
		accountNumber=x;
		balance=y;
		accountHolderName=z;
	}
	
	public void set_accountNumber(int x){
		accountNumber=x;
	}
	
	public void set_balance(double y){
		balance=y;
	}
	
	public void set_accountHolderName(String z){
		accountHolderName=z;
	}
	
	
	public int get_accountNumber(){
		return accountNumber;
	}
	
	public double get_balance(){
		return balance;
	}
	
	public String get_accountHolderName(){
		return accountHolderName;
	}
	
	
	public void Show(){
		System.out.println("Account Number:"+get_accountNumber());
		System.out.println("Account Balance:"+get_balance());
		System.out.println("Account Holder Name:"+get_accountHolderName());
	}
	
	public static void main(){
		Account a1= new Account();
		Account a2= new Account(2,1000,"Rose");
		
		a1.set_accountNumber(1);
		a1.set_balance(100);
		a1.set_accountHolderName("Jack");
		
		
		a1.get_accountNumber();
		a1.get_balance();
		a1.get_accountHolderName();
		a1.Show();
		
		
		//a2.set_accountNumber(2);
		//a2.set_balance(1000);
		//a2.set_accountHolderName("Rose");
		
		
		a2.get_accountNumber();
		a2.get_balance();
		a2.get_accountHolderName();
		a2.Show();
	}
}





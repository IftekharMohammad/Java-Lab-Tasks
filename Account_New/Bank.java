import java.lang.*;

public class Bank{
	private String BankName;
	private String address;
	private Account[] account;


	public Bank(){
	}
	public Bank(String BankName, String address){
		account = new Account[100];
		this.BankName=BankName;
		this.address=address;
	}
	
	public void setAll(String BankName, String address){
		this.BankName=BankName;
		this.address=address;
	}
	public void addAccount(Account a){
		int i = 0;
		while(account[i]!=null){
			i++;
		}
		account[i]=a;
	}
	
	public void deleteAccount(Account a){
		int i = 0;
		while(account[i]!=a){
			i++;
		}
		account[i]=null;
	}
	
	public void Show(){
		int i = 0;
		while(account[i]!=null){
			account[i].Show();
		}
	}
}
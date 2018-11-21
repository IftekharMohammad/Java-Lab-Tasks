import java.lang.*;

public class Start{
	public static void main(String args[]){
		Account a1= new Account("Alim","ACC-01",111100);
		Account a2= new Account("Iftekhar","ACC-02",0);
		Account a3= new Account("Sazzad","ACC-03",1100);
		
		a1.depositCash(100);
		a1.withdrawCash(200);
		a1.transferCash(a2,1000);
		
		a2.depositCash(100);
		a2.withdrawCash(200);
		a2.transferCash(a3,1000);
		
		a3.depositCash(100);
		a3.withdrawCash(200);
		a3.transferCash(a2,1000);
		
		a1.Show();
		a2.Show();
		a3.Show();
		
		
		Bank b1 = new Bank();
		
		b1.setAll("Rupali", "Shemoli,Dhaka");
		b1.addAccount(a1);
		b1.addAccount(a2);
		b1.addAccount(a3);
		b1.deleteAccount(a3);
		b1.Show();
	}
}
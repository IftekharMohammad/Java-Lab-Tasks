import java.lang.*;

public class Start{
	public static void main(String args[]){
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
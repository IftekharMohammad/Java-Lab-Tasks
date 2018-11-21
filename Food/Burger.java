import java.lang.*;

public class Burger extends FoodItem{
	private int numberOfPatties;
	
	public Burger(){
		super();
		System.out.println("Empty Burger");
	}
	
	public Burger(int numberOfPatties,double price, String Name){
		super(price,Name);
		this.numberOfPatties=numberOfPatties;
	}
	
	public void setNumberOfPatties(int numberOfPatties){
		this.numberOfPatties=numberOfPatties;
	}
	
	public int getNumberOfPatties(){
		return numberOfPatties;
	}
}
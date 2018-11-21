import java.lang.*;

public class FoodItem{
	protected double price;
	protected String name;
	
	public FoodItem(){
		System.out.println("Empty Parent");
	}
	
	public FoodItem(double price, String name){
		this.price=price;
		this.name=name;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
	
	public void showDetails(){
		System.out.println("Price: "+price);
		System.out.println("Name: "+name);
	}
}
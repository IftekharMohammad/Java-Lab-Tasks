import java.lang.*;

public class Pizza extends FoodItem{
	private String size;
	
	public Pizza(){
		super();
		System.out.println("Empty Pizza");
	}
	
	public Pizza(String size,double price, String Name){
		super(price,Name);
		this.size=size;
	}
	
	public void setSize(String size){
		this.size=size;
	}
	
	public String getSize(){
		return size;
	}
}
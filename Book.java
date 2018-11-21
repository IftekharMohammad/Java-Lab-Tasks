import java.lang.*;

public class Book{
	private int id;
	private String name;
	private double price;
	public Book(){
		System.out.println("Empty Class");
	}
	public Book(int x, String y, double z){
		id=x;
		name=y;
		price=z;
	}
	public void set_id(int x){
		id=x;
	}
	public void set_name(String y){
		name=y;
	}
	public void set_price(double z){
		price=z;
	}
	
	public int get_id(){
		return id;
	}
	public String get_name(){
		return name;
	}
	public double get_price(){
		return price;
	}
	
	public void show(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
	
	public static void main(String argv[]){
		Book std = new Book();
		Book std1 = new Book(1,"A",3.99);
		std.set_id(1);
		std.set_name("Java");
		std.set_price(2.4);
		
		
		System.out.println("ID: "+std.get_id());
		System.out.println("Name: "+std.get_name());
		System.out.println("price: "+std.get_price());
		
		std.show();
		std1.show();
	}
}
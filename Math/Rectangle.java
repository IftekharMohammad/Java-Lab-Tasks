import java.lang.*;

public class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(){
		System.out.println("Empty Constructor");
	}
	
	public Rectangle(double x, double y){
		length=x;
		width=y;
	}
	
	public void set_length(double x){
		length=x;
	}
	
	public void set_width(double y){
		width=y;
	}
	
	public double get_length(){
		return length;
	}
	
	public double get_width(){
		return width;
	}

	
	
	public void ShowArea(){
		System.out.println("Area:"+(get_length()*get_width()));

	}
	
}





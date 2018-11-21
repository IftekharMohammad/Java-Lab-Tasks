import java.lang.*;

public class Triangle{
	private double height;
	private double base;
	
	public Triangle(){
		System.out.println("Empty Constructor");
	}
	
	public Triangle(double x, double y){
		height=x;
		base=y;
	}
	
	public void set_height(double x){
		height=x;
	}
	
	public void set_base(double y){
		base=y;
	}
	
	public double get_height(){
		return height;
	}
	
	public double get_base(){
		return base;
	}

	
	
	public void ShowArea(){
		System.out.println("Area:"+(0.5*(get_height()*get_base())));

	}
	
}
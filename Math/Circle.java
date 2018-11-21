import java.lang.*;

public class Circle{
	private double radius;
	
	public Circle(){
		System.out.println("Empty Constructor");
	}
	
	public Circle(double x){
		radius=x;
	}
	
	public void set_radius(double x){
		radius=x;
	}
	
	public double get_radius(){
		return radius;
	}
	
	public void showArea(){
		System.out.println("Area:"+(3.1416*(get_radius()*get_radius())));
	}
}
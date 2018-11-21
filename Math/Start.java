import java.lang.*;

public class Start{
	public static void main(String args[]){
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle(10.0,10.0);
		
		r1.set_length(5.0);
		r1.set_width(5.0);
		System.out.println("Length: "+r1.get_length());
		System.out.println("Width: "+r1.get_width());
		r1.showArea();
		
		System.out.println("Length: "+r2.get_length());
		System.out.println("Width: "+r2.get_width());
		r2.showArea();
		
		Triangle t1= new Triangle();
		Triangle t2= new Triangle(20.0,20.0);
		
		t1.set_height(5.0);
		t1.set_base(5.0);
		System.out.println("height: "+t1.get_height());
		System.out.println("base: "+t1.get_base());
		t1.showArea();
		
		System.out.println("height: "+t2.get_height());
		System.out.println("base: "+t2.get_base());
		t2.showArea();
		
		
		Circle c1= new Circle();
		Circle c2= new Circle(30.0);
		
		c1.set_radius(5.0);
		System.out.println("height: "+c1.get_radius());
		c1.showArea();
		
		System.out.println("height: "+c2.get_radius());
		c2.showArea();
	}
}
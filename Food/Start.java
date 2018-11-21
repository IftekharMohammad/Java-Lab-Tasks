import java.lang.*;

public class Start{
	public static void main(String args[]){
		Burger b1 = new Burger();
		Burger b2 = new Burger(3,100.0,"No Idea");
		
		b1.setNumberOfPatties(5);
		b1.showDetails();
		System.out.println("Number Of Patties 1: "+b1.getNumberOfPatties());
		
		b2.showDetails();
		System.out.println("Number Of Patties 2: "+b2.getNumberOfPatties());
		
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza("Big",150.5,"Can't eat it");
		
		p1.setSize("Small");
		p1.showDetails();
		System.out.println("Size Of Pizza 1: "+p1.getSize());
		
		p2.showDetails();
		System.out.println("Size Of Pizza 2: "+p2.getSize());
	}
}
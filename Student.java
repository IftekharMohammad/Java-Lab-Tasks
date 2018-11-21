import java.lang.*;

public class Student{
	private int id;
	private String name;
	private double cgpa;
	public Student(){
	}
	public Student(int x, String y, double z){
		id=x;
		name=y;
		cgpa=z;
	}
	public void set_id(int x){
		id=x;
	}
	public void set_name(String y){
		name=y;
	}
	public void set_cgpa(double z){
		cgpa=z;
	}
	
	public int get_id(){
		return id;
	}
	public String get_name(){
		return name;
	}
	public double get_cgpa(){
		return cgpa;
	}
	
	public void show(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+cgpa);
	}
	
	public static void main(String argv[]){
		Student std = new Student();
		Student std1 = new Student(1,"A",3.99);
		std.set_id(1);
		std.set_name("Java");
		std.set_cgpa(2.4);
		
		
		System.out.println("ID: "+std.get_id());
		System.out.println("Name: "+std.get_name());
		System.out.println("CGPA: "+std.get_cgpa());
		
		std.show();
		
		std1.show();
	}
}
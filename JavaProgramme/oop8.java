import java.util.*;
class Square{
	private double side;
	Square(double s){
		side=s;
	}
	void disp(){
		System.out.println("side="+side);
	}
	void area(){
		double ar=side*side;
		System.out.println("area="+ar);
	}
}
class oop8{
	public static void main(String arg[]){
		Square r=new Square(2.5);
		r.disp();
		r.area();
	}
}
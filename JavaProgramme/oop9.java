import java.util.*;
class SimpleInterest{
	private double p,t,r;
	SimpleInterest(double p,double t,double r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	void disp(){
		System.out.println("principle="+p);
		System.out.println("time="+t);
		System.out.println("rate of interest="+r);
	}
	void SimpleInterest(){
		double SI=p*t*r/100;
		System.out.println("SimpleInterst="+SI);
	}
}
class oop9{
	public static void main(String arg[]){
		SimpleInterest s=new SimpleInterest(2000,3,5);
		s.disp();
		s.SimpleInterest();
	}
}
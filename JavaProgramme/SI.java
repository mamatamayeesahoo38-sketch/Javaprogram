import java.util.*;
class SI
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p");
		double p=sc.nextDouble();
		System.out.println("enter t");
		double t=sc.nextDouble();
		System.out.println("enter r");
		double r=sc.nextDouble();
		double SI=p*t*r/100;
		System.out.println("simple interest="+SI);
	}
}
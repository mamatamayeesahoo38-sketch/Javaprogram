import java.util.*;
class f_to_c
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double f=sc.nextDouble();
		double c=(f-32)*5/9;
		System.out.println("temperature in centigrade="+c);
	}
}
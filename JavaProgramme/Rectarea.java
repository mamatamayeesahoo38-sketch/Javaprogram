import java.util.*;
class Rectarea
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle");
		int l=sc.nextInt();
		System.out.println("enter breadth of rectangle");
		int b=sc.nextInt();
		int a=l*b;
		System.out.println("length of rectangle="+l);
		System.out.println("breadth of rectangle="+b);
		System.out.println("area of rectangle="+a);
	}
}
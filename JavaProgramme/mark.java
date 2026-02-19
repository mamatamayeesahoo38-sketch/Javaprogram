import java.util.*;
class Q12
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark1");
		int m1=sc.nextInt();
		System.out.println("enter mark2");
		int m2=sc.nextInt();
		System.out.println("enter mark3");
		int m3=sc.nextInt();
		System.out.println("enter mark4");
		int m4=sc.nextInt();
		System.out.println("enter mark5");
		int m5=sc.nextInt();
		int totalmark=m1+m2+m3+m4+m5;
		int avg=total/5;
		System.out.println("mark1="+m1);
		System.out.println("mark2="+m2);
		System.out.println("mark3="+m3);
		System.out.println("mark4="+m4);
		System.out.println("mark5="+m5);
		System.out.println("totalmark="+totalmark);
		System.out.println("avg mark="+avg);
	}
}
import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,r;
		System.out.println("enter a minimum reange to maximum range");
		i=sc.nextInt();
		r=sc.nextInt();
		while(i<=r)
		{
			System.out.println(i);
			i++;
		}
	}
}
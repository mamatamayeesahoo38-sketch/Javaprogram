import java.util.*;
class Q5
{
	public static void main(String []arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,height,age,female");
		String nm=sc.nextLine();
		double ht=sc.nextDouble();
		int age=sc.nextInt();
		boolean p=sc.nextBoolean();
		System.out.println("my name ="+nm);
		System.out.println("height="+ht);
		System.out.println("age="+age);
		System.out.println("female="+p);

	}
}
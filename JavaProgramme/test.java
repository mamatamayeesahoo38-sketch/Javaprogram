import java.util.*;
class Test
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];
		arr=new int[4];
		int i;
		System.out.println("enter 4 elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
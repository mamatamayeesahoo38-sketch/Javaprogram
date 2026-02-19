import java.util.*;
class elementinput
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];   
		arr=new int[4];
		int index;
		System.out.println("enter 4 elements ");
		for(index=0;index<arr.length;index++);
		{
			arr[index]=sc.nextInt();
		}
		System.out.println("elements are ");
		for(index=0;index<arr.length;index++)
		{
			System.out.print(arr[index]+" ");
		}

	}
}
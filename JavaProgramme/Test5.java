import java.util.Scanner;
class Test5
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=4-i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
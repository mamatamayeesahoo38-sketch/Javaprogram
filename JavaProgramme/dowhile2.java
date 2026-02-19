class dowhile2
{
	public static void main(String arg[])
	{
		int i,j;
		i=1;
		do
		{
			j=1;
			while(j<=4)
			{
				System.out.print(j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}while(i<=3);
	}
}
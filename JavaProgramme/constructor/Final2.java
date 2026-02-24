class Final2
{
	public static void main(String [] args)
	{
		int a=10;
		final int b=a;
		System.out.println(a+" "+b);
		//b=30; error
		a=40;
		System.out.println(a+" "+b);

	}
}

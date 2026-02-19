class Constructor
{

	Constructor()
	{

         System.out.println("AC");
	}
	
}
class B extends Constructor
{
	B()
	{

         System.out.println("BC");
	}
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
	}
}
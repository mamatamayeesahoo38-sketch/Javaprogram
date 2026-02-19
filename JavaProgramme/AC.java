class AC
{

	AC()
	{
		System.out.println("AC");
	}
}
class B extends AC
{
	B()
	{

         System.out.println("BC");
	}
}
public class Test
{
	public static void main(String arg[])
	{
		B ob=new B();
	}
}
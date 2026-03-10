interface A
{
	void show(); 

}
class B implements A
{
    public  void show()
    {
    	System.out.println("show method ");
    }
   
}
class Test
{
	public static void main(String arg[])
	{
		A ob=new B();
		ob.show();
	}
}

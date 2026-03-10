interface A
{
	void show(); 
  
}
interface B extends A
{
	void disp();
	
}
class C implements B
{
    public  void show()
    {
    	System.out.println("show method ");
    }
     public  void disp()
    {
    	System.out.println("disp method ");
    }
   
}
class Test
{
	public static void main(String arg[])
	{
		B ob=new C();
		ob.show();
		ob.disp();
		
	}
}



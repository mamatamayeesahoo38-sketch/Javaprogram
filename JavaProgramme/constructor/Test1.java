class Test1
{
	int x,y; 
    void show() 
    {
       
        System.out.println(this);
    }

	public static void main(String arg[])
	{
	    Test1 t=new Test1();
	    System.out.println(t);
	    t.show();
	}
}


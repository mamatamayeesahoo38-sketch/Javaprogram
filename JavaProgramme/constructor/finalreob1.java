class Test
{
	int x,y;  
    void show() 
    {
        System.out.println(x+" "+y); 
        System.out.println(this.x+" "+this.y);
    }

	public static void main(String arg[])
	{
	    Test t=new Test();
	    t.show();
	    t.x=30;
	    t.y=40;
	    t.show();
	}
}

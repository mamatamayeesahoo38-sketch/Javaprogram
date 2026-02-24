class t1
{
	int x,y; //instance variable  created when object create 
	public static void main(String arg[])
	{
	    Test t=new Test();
	    Test t1=new Test();
	    t.x=10;
	    t1.y=20;
	    System.out.println(t+" "+t1);
	    System.out.println(t.x+" "+t.y);
	    System.out.println(t1.x+" "+t1.y);
	}
}

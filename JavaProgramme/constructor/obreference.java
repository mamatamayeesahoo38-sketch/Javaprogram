class Obreference
{
	int x,y; //instance variable  created when object create 
	public static void main(String arg[])
	{
	    Test t=new Test(); 
	    t.x=10;
	    t.y=20;
	    System.out.println(t); 
	    System.out.println(t.x+" "+t.y); 
	    t=new Test();
	     System.out.println(t.x+" "+t.y); 
	    t.x=30;
	    t.y=40;
	    System.out.println(t);  
	    System.out.println(t.x+" "+t.y); 
	}
}
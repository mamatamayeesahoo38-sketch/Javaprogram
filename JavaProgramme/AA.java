class AA
 {
    void showAA() 
    {
     System.out.println("AA class"); 
     }
}

class B extends AA
 {
    void showB()
     { 
    System.out.println("B class"); 
    }
}
class Test
{
	public static void main(String arg[])
	{
	    B ob=new B();
	    ob.showAA();
	    ob.showB();
	    AA obj=new AA();
	    obj.showAA();
	   // obj.showB(); error
	}
}


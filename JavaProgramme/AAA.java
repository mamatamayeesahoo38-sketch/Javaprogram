class AAA {
    void showAAA() { System.out.println("AAA class"); }
}

class B extends AAA {
    void showB() { System.out.println("B class"); }
}

class C extends B {
    void showC() { System.out.println("C class"); }
}

class Test
{
	public static void main(String arg[])
	{
	    C ob=new C();
	    ob.showAAA();
	    ob.showB();
	    ob.showC();
	}
}

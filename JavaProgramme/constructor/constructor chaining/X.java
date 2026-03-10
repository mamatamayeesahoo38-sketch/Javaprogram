class X
{
    X()
    {
        System.out.println("bye");
    }

    X(int a)
    {
        this(); 
        System.out.println("hi " + a);
    }
}

public class Test
{
    public static void main(String arg[])
    {
        X ob = new X(10);
    }
}
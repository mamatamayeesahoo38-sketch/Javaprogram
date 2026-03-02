class X
{
    X()
    {
        this(10);   // must be first statement
        System.out.println("bye");
    }

    X(int a)
    {
        System.out.println("hi " + a);
    }
}

class Test
{
    public static void main(String[] args)
    {
        X ob = new X();
    }
}
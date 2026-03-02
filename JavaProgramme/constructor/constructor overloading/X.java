class X
 {
 	X()
 	{
        
 	}
 	X(int a)
 	{
            System.out.println("hi  " + a);
 	}
 	X(double b)
 	{
           System.out.println("bye "+ b);
 	}
 	X(int a,int b) 
 	{
 		System.out.println("ok ");
 	}
 	X(int a,double b) 
 	{
        
 	}
 	X(double a ,int b)   
 	{
        
 	}
class Test
{
    
        public static void main(String arg[])
        {
            
           X ob=new X(10);  
           X obj=new X(2.5);

        }
}


 }
package multithreading;



class B extends Thread
{
    public void run()
    {
    	Thread t1=Thread.currentThread();
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("Welcome to::+t1.getName()");
       }
    	try
    	{
    		Thread.sleep(1000);
    	}
    	catch(InterruptedException e)
    	{
    		e.printStackTrace();
    	}
    }
}
    class C extends Thread
    {
    	public void run()
    	{
    		Thread t1= Thread.currentThread();
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Good Bye::+t1.getName()");
    		}
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException e)
    		{
    			e.printStackTrace();
    		}
        }
    }
	

public class Tester3 {

	public static void main(String[] args) 
	{
		B b1= new B();
		C c1= new C();
		b1.setName("Selenium");
		c1.setName("Java");
		b1.start();
		c1.start();

	}

}
    

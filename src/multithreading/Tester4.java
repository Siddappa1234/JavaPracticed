package multithreading;

class A extends Thread
{
	public void run()
	{ 
		Thread t1=Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi from::"+t1.getName());
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
public class Tester4 {

	public static void main(String[] args) 
	{
		A a1= new A();
		a1.setName("US");
		a1.start();
		Thread t1=Thread.currentThread();
		t1.setName("India");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Namastey From::"+t1.getName());
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

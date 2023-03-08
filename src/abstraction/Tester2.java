package abstraction;
class D implements Runnable
{
	@Override
	public void run()
	{
		Thread t1=Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(t1.getName()+"::"+i);
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
}
public class Tester2 {

	public static void main(String[] args) 
	{
		D rv= new D();
		Thread t= new Thread(rv);
		for(int i=1;i<=5;i++)
		{
			System.out.println(t.getName()+"::"+i);
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

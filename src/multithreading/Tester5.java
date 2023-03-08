package multithreading;

public class Tester5 
{
     int balance=200000;
     synchronized void transfer(int tamount)
     {
    	 Thread t1= Thread.currentThread();
    	 System.out.println(t1.getName()+":: started");
    	 if(tamount<=balance)
    	 {
    		 System.out.println(t1.getName()+"::transfered::"+tamount);
    		 System.out.println("::the balance deducted");
    		 balance=balance-tamount;
    	 }
    	 else
    	 {
    		 System.out.println("Insufficient balance");
    	 }
    	 System.out.println(t1.getName()+"::Ended");
     }
	public static void main(String[] args)
	{
		

	}

}

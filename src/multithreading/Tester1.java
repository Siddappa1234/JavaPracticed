package multithreading;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException 
	{
		String rv="We have Automation";
		for(int i=0;i<rv.length();i++)
		{
			System.out.println(rv.charAt(i));
			Thread.sleep(200);
		}
        System.out.println();
	}

}

package globalvariable;

class A 
{
     static int a=10;
     static void test()
     {
    	 System.out.println("From test:"+a);
     }
	public static void main(String[] args)
	{
	   System.out.println("Main starts");	
	   System.out.println("From main:"+a);
	   test();
	   System.out.println("Main Ends");
     
	}

}

package designpattern;

 class A 
{
    static A a1= null;
    void test()
    {
    	System.out.println("Running test");
    }
    private A()
    {
    	System.out.println("private constructor");
    }
    public static A demo()
    {
    	if(a1==null)
    	{
    		a1=new A();
    		return a1;
    	}
    	else
    	{
    		return a1;
    	}
    }
    public class Tester1
    {
	public static void main(String[] args) 
	{
		A a1=A.demo();
		a1.test();
		A a2=A.demo();
		a2.test();
		A a3=A.demo();

	}
    }
}

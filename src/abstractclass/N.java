package abstractclass;

abstract class AB
{
	abstract void test();
	
}
    class O extends AB
    {
    	
    	void test()
    	{
    		System.out.println("test is overridden in class C");
    	}
    }
    class N
    {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		O o1= new O();
		o1.test();
		System.out.println("Main ends");

	}

}


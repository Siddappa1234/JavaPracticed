package abstractclass;



abstract class T
{
	abstract void test();
	
}
    class M extends T
    {
    	
    	void test()
    	{
    		System.out.println("test is overridden in class S");
    	}
    }
    class S
    {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		M m1= new M();
		m1.test();
		System.out.println("Main ends");

	}

}

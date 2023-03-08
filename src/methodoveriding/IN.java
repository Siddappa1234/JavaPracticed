package methodoveriding;

class IB 
{
    void test1()
    {
    	System.out.println("Super class implementation");
    }
}
    class IM extends IB
    {
    	void test1() {
    		super.test1();
    		
    			System.out.println("Sub class implementation");
    		
    	}
    }
    class IN
    {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		IM rv= new IM();
		rv.test1();
		System.out.println(" Main Ends");

	}

}


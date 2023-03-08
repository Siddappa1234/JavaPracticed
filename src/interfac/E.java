package interfac;

 class EX 
 {
    int i;
    static void test(EX e1)
    {
    	System.out.println("Value of i is:"+e1.i);
    	//return  (return is default for void)
    }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		EX e1= new EX();
		test(e1);// supplying r address to b1 which holds i variable 
		System.out.println("Main Ends ");

	}

}

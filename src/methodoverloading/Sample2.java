package methodoverloading;

 class Sample2 
 {
     static void test(int a)
     {
    	 System.out.println("From test(int a)");
     }
     static void test(int a)
     {
    	 System.out.println("From test(int a)");
     }
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		System.out.println("From test(int a)");
		test(10);// compiler gets confused as to which method called
		System.out.println("Main Ends ");
		

	}

}

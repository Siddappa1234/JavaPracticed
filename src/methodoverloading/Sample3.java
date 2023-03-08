package methodoverloading;

 class Sample3 
 {
       public static void main(int a)
       {
    	   System.out.println("From main (int a)");
       }
       public static void main(double d)
       {
    	   System.out.println("From main (double d)");
       }
	public static void main(String[] args) 
	{
		System.out.println("The original main starts");
		main(10);
		main(10.5);
		System.out.println("The original main ends");

	}

}

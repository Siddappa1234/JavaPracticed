package constructor;

class Sample5 
{
	String name;
	Sample5(String name)
	{
		this.name=name;
	}
     void test()
     {
    	 Sample5 s5= new Sample5("Krishna");
     
     System.out.println(this.name);
     System.out.println(s5.name);
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample5 rv1= new Sample5("Rama");
		rv1.test();
		System.out.println(" Main Ends");

	}

}

package interfac;

interface  KS
{
     int a=10;
}   // by default it is public static and final
     class S
     {
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		System.out.println("Value of a is"+KS.a);
		System.out.println("Main Ends");

	}

}


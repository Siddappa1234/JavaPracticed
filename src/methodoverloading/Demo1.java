package methodoverloading;

 class Demo1 
 {
	 static void add(int a, int b)
	 {
		 System.out.println("The addition is :"+(a+b));
	 }
	 static void add(int a, int b,int c)
	 {
		 System.out.println("addition result is:"+(a+b+c));
	 }

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		add(10,20);
		add(10,20,30);
	}

}

package constructor;

 class Sample2 {
	 //constructor overloading
	 int empID;
	 Sample2(int id)
	 {
		 empID=id;
	 }
	 Sample2()
	 {
		 empID=90;
	 }

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample2 rv1= new Sample2(100);
		System.out.println("Value of empID is"+rv1.empID);
		System.out.println("---------");
		Sample2 rv2= new Sample2();
		System.out.println("Value of empID is"+rv2.empID);
		System.out.println(" Main Ends");

	}

}

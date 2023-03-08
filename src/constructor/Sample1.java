package constructor;

class Sample1 {
	int empID;
	Sample1()
	{
		System.out.println("Running constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		Sample1 rv= new Sample1();
		System.out.println("Value of empID is"+rv.empID);
		System.out.println("--------");
		Sample1 rv1=new Sample1();
		System.out.println("Value of empID is+rv1.empID");
		System.out.println("Main Ends ");

	}

}

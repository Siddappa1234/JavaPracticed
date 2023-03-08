package constructor;

 class Student1 // Business class
 {
    static int stdID=10;
    static void percentage()
    {
    	System.out.println("percentage method");
    }
    class A   //Main class
    {
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Student1.percentage();
		System.out.println("student ID is"+Student1.stdID);
		

	}

     }
 }

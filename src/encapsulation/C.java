package encapsulation;

public class C 
{
     static C c1;
     int empID;
     static void test()
     {
    	 System.out.println("From test"+c1.empID);
    	 c1.empID=190;
    	 System.out.println("From test"+c1.empID);
    	 return;
     }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		c1= new C();
		System.out.println("From Main"+c1.empID);
		c1.empID=90;
		test();
		System.out.println("From test"+c1.empID);
		System.out.println("Main ends");

	}

}

package functions;

public class Sample4 {
	static int cube(int num)
	{
		int c=num*num*num;
		return c;
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		int res=Sample4.cube(2);
		System.out.println("The Result is"+res);
		System.out.println("main Ends");

	}

}

package functions;

public class Sample2
{
	static void addition(int n1, int n2)
	{
		int add= n1+n2;
		System.out.println("The Result is:"+add);
	}

	public static void main(String[] args)
	{
		System.out.println("Main starts");
		Sample2.addition(2, 3);
		Sample2.addition(4, 14);
		System.out.println("Main Ends");

	}

}

package functions;

public class Sample1 {
	static void square(int num)
	{
		int sq=num*num;
		System.out.println("The Result is:"+sq);
		return;
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample1.square(2);
		System.out.println("main ends");
	}

}

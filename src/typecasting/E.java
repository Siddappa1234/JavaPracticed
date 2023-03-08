package typecasting;

class E {
static void test(int a)
{
	System.out.println("test(int a):"+a);
}
	public static void main(String[] args) 
	{
		test((int)90.5);// explicit narrowing
		System.out.println("Done");

	}

}

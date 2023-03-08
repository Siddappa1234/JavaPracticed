package typecasting;

 class B {

	public static void main(String[] args)
	{
		int a=(int) 10.5;//explicit narrowing
		System.out.println("value is"+ a);
		double d=10;// auto-widening
		System.out.println("Value is"+d);
		double dd= (double) 90;// explicit widening
		System.out.println("Value is"+dd);
	}

}

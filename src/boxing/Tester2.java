package boxing;

public class Tester2 {

	public static void main(String[] args) 
	{
		Integer rv1= new Integer(90);//Boxing
		int a=rv1.intValue(); //Un-Boxing
		System.out.println(a);
		
		Double rv2= new Double(90.5);
		double d= rv2.doubleValue();
		System.out.println(d);
		
		Boolean rv3= new Boolean(true);
		boolean b= rv3.booleanValue();
		System.out.println(b);

	}

}

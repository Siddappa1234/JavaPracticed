package arrays;

public class Tester2 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[2];
		arr[0]=10;
		arr[1]=20;
		System.out.println(arr.length);
		for(int a:arr)
		{
			System.out.println(a);
		}
		double[] darr=new double[2];
		darr[0]=10.1;
		darr[1]=10.2;
		System.out.println(darr.length);
		for(double d:darr)
		{
			System.out.println(d);
		}

	}

}

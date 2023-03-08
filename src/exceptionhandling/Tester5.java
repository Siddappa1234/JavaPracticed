package exceptionhandling;

public class Tester5 {

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		int[] arr1= {10,20,30,40,50,60};
		int[] arr2= {10,0,30,0,50};
		for(int i=0;i<arr1.length;i++)
		{
			try
			{
				System.out.println(arr1[i]/arr2[i]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Dividing by zero");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Index not available");
			}
			
		}
		  System.out.println("Main Ends ");

	}

}

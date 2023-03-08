package arrays;

public class Tester5 
{

	public static void main(String[] args) 
	{
		int [] arr=new int[5];// maximum element 
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			System.out.println("Maximum element is"+max);
		}

	}

}

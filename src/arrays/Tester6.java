package arrays;

public class Tester6 {

	public static void main(String[] args)
	{
		int[] arr= new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		int min=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			System.out.println("minium element is"+min);
	
	}

}
}
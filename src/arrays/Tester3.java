package arrays;

import java.util.Arrays;

public class Tester3 {

	public static void main(String[] args) 
	{
		int arr[]= new int[5];
		arr[0]=40;
		arr[1]=50;
		arr[2]=10;
		arr[3]=20;
		arr[4]=30;
		for(int a:arr)
		{
			System.out.println(a);
			
		}
		System.out.println("-------");
		Arrays.sort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}

	}

}

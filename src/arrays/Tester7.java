package arrays;

public class Tester7 {

	public static void main(String[] args) 
	{
		int []arr= new int[5];
		arr[0]=50;
		arr[1]=40;
		arr[2]=30;
		arr[3]=20;
		arr[4]=10;
		System.out.println("****before****");
		for(int a:arr)
		{
			System.out.println(a);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
       System.out.println("*****After*****");
       for(int a:arr)
       {
    	   System.out.println(a);
       }
	}

}

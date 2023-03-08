package arrays;

import java.util.Arrays;

public class Tester14 {

	public static void main(String[] args) 
	{
		String []ref= new String[5];
		ref[0]="Qspiders";
		ref[1]="Jspiders";
		ref[2]="Nspiders";
		ref[3]="Ospiders";
		ref[4]="Hspiders";
		for(String S:ref)
		{
			System.out.println(S);
		}
		Arrays.sort(ref);
		System.out.println("----");
		for(String S:ref)
		{
			System.out.println(S);
		}
		System.out.println(Arrays.binarySearch(ref, "Qspiders"));
		System.out.println(Arrays.binarySearch(ref,"Npiders"));
		System.out.println(Arrays.binarySearch(ref, "Spiders"));

	}

}

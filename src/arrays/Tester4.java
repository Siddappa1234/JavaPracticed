package arrays;

import java.util.Arrays;

public class Tester4 {

	public static void main(String[] args)
	{
		char[] carr= new char[5];
		carr[0]='E';
		carr[1]='D';
		carr[2]='C';
		carr[3]='B';
		carr[4]='A';
		for(char ch:carr)
		{
			System.out.println(ch);
		}
		Arrays.sort(carr);
		System.out.println("*******");
		for(char ch:carr)
		{
			System.out.println(ch);
		}
		System.out.println("*******");
		System.out.println(Arrays.binarySearch(carr,'B'));
		System.out.println(Arrays.binarySearch(carr,'E'));
		System.out.println(Arrays.binarySearch(carr,'Q'));
		
		

	}

}

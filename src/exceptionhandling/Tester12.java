package exceptionhandling;

import java.util.Scanner;

public class Tester12 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String s1= scan.nextLine();
		System.out.println("Please enter a word in a sentence");
		String s2= scan.next();
		System.out.println("Please enter a word to replace");
		String S3=scan.next();
		s1=s1.replaceAll(s2, S3);
		System.out.println(s1);
		scan.close();

	}

}

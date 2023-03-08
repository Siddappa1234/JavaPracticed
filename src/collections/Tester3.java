package collections;

import java.util.ArrayList;

public class Tester3 {

	public static void main(String[] args) 
	{
		ArrayList list1= new ArrayList();
		ArrayList list2= new ArrayList();
		ArrayList list3= new ArrayList();
		
		list1.add(10);
		list2.add(20);
		list3.add(30);
		
		list1.add(10.2);
		list2.add(10.3);
		list3.add(10.4);
		
		list3.add("Hi");
		list3.add("Hello");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println("-----");
		System.out.println(list1.addAll(list2));
		System.out.println(list2.addAll(1,list3));
		
		
		

	}

}

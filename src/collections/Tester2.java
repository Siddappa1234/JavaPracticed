package collections;

import java.util.ArrayList;

public class Tester2 {

	public static void main(String[] args) 
	{
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add(true);
		System.out.println(list);
		list.add("Hello");
		System.out.println(list);
		list.add(2,"Hey");
		System.out.println(list);
		list.set(1, 90);
		System.out.println(list);
		list.addAll(list);
		//list.addAll(index,list);

	}

}

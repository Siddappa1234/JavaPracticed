package collections;

import java.util.ArrayList;

public class Tester4 {

	public static void main(String[] args) 
	{
		ArrayList list= new ArrayList();
		list.add("Hello");
		list.add("Hey");
		list.add(90.9);
		list.add(true);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.clear();
		System.out.println(list);

	}

}

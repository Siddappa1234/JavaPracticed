package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Tester8 {

	public static void main(String[] args) 
	{
		ArrayList list= new ArrayList();
		list.add("Grapes");
		list.add(90);
		list.add("mango");
		list.add("Apple");
		list.add("orange");
		System.out.println(list);
		Collections.sort(list);// Runtime error
		System.out.println(list);
		// we cannot compare Hetergenous elements but we can Store hetergenous elements in collections	

	}

}

package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Tester7 {

	public static void main(String[] args)
	{
		ArrayList list= new ArrayList();
		list.add("Einstein");
		list.add("Darwin");
		list.add("Charles");
		list.add("Bachan");
		list.add("Amir");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,"Charles"));
		System.out.println(Collections.binarySearch(list, "Einstein"));
		System.out.println(Collections.binarySearch(list, "Amir"));
		
		

	}

}

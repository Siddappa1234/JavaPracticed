package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Tester18 {

	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		set.add(10);
		set.add(10.5);
		set.add(null);
		set.add('A');
		set.add(true);
		set.add(90.5);
		System.out.println(set);
		Iterator itr1= set.iterator();
		while(itr1.hasNext());
		{
			System.out.println(itr1.next());
		}
		System.out.println("*********");
		System.out.println(set);
        Iterator itr2=set.iterator();
        while(itr2.hasNext());
        System.out.println(itr2.next());
        
        
	}

}

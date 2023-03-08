package collections;

import java.util.HashSet;

public class Tester14 {

	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		System.out.println(set.add(10));
		System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(30.5));
        System.out.println(set.add("Hey"));
        System.out.println(set.add('A'));
        System.out.println(set.add(30.5));
        System.out.println(set.add(set.size()));
        System.out.println(set);
        
	}

}

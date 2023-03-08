package collections;

import java.util.PriorityQueue;

public class Tester12 {

	public static void main(String[] args) 
	{
		PriorityQueue queue= new PriorityQueue();
		queue.add('E');
		queue.add('D');
		queue.add('C');
		queue.add('B');
		queue.add(90);// Runtime error we cannot compare characters and Numbers
		queue.add('A');
		System.out.println(queue);

	}

}

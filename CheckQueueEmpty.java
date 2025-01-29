package CollectionTopics;

import java.util.LinkedList;
import java.util.Queue;

public class CheckQueueEmpty {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q1 = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		System.out.println(q1);
		System.out.println("Queue is Empty - "+q.isEmpty());
		System.out.println("Queue is Empty - "+q1.isEmpty());
	}

}

package CollectionTopics;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveAllinQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);
		q.add(11);
		q.add(13);
		System.out.println("Before Remove"+q);
		q.removeAll(q);
		System.out.println("After Remove"+q);

	}

}

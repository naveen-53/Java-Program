package CollectionTopics;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveTopBottominQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> tempQueue = new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);
		q.add(11);
		q.add(13);
		System.out.println("Before Removing"+q);
		q.poll();
		while(q.size()>1) {
			tempQueue.add(q.poll());
		}
		q.poll();
		q.addAll(tempQueue);
		System.out.println("After Removing"+q);

	}

}
package CollectionTopics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MaxInQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);
		q.add(11);
		q.add(13);
		System.out.println(q);
		int max = Integer.MIN_VALUE;
		Iterator<Integer> i= q.iterator();
		while(i.hasNext()) {
			int var=i.next();
			if(max<var) {
				max=var;
			}
		}
		System.out.println("Maximum element in Queue: "+max);

	}

}

package CollectionTopics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MedianofQueue {

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
		int total=0;
		int size=q.size();
		Iterator<Integer> i =q.iterator();
		
		while(i.hasNext()) {
			total+=i.next();
		}
		double median=total/size;
		System.out.println("Median of Queue is "+median);

	}

}

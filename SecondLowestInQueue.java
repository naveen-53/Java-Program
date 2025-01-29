package CollectionTopics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SecondLowestInQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(3);
		q.add(111);
		q.add(7);
		q.add(9);
		q.add(11);
		q.add(13);
		System.out.println(q);
		
		int lowest=Integer.MAX_VALUE;
		int secondLowest=Integer.MAX_VALUE;
		
		Iterator<Integer> i =q.iterator();
		while(i.hasNext()) {
			int var=i.next();
			if(var<lowest) {     //1<100   3<1
				secondLowest=lowest;
				lowest=var;
			}
			else if(var>lowest && secondLowest>var) { 
				secondLowest=var;
			}
		}
		System.out.println("Second Lowest Element is "+secondLowest);

	}

}

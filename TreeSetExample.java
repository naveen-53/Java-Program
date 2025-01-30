package CollectionTopics;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		System.out.println(ts);
		System.out.println("Reversed Order "+ts.reversed());
		System.out.println("First Element "+ts.getFirst());
		System.out.println("First Element "+ts.getLast());
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(1);
		ts1.add(5);
		ts1.add(2);
		ts1.add(10);
		ts1.add(6);
		ts1.add(1);
		ts1.add(20);
		
		TreeSet<Integer> ts2 = (TreeSet<Integer>) ts1.headSet(7);
		System.out.println(ts2);

	}

}

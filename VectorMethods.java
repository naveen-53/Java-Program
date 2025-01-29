package CollectionTopics;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Vector<Integer> v1 = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		System.out.println(v);
		
		v1.addAll(v);
		System.out.println(v1);
		
		v.insertElementAt(70, 3);
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		v.remove(3);
		System.out.println(v);
		
		v.removeElementAt(5);
		System.out.println(v);
		
		
		v.removeIf(n -> (n%3==0));
		System.out.println(v);
		
		v1.retainAll(v);
		System.out.println(v1);
		
	}

}

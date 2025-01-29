package CollectionTopics;

import java.util.Vector;

public class CountItemsVector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		v.add("apple");
		v.add("orange");
		v.add("banana");
		v.add("apple");
		v.add("orange");
		v.add("banana");
		v.add("apple");
		
		Vector<String> unique = new Vector<>();
		Vector<Integer> countItems = new Vector<>();
		
		for(String s : v) {
			int index= unique.indexOf(s);  //-1 -1 -1
			if(index!=-1) {
				countItems.set(index, countItems.get(index)+1); //(0,2) (1,2) (2,2) (0,3)
			}
			else {
				unique.add(s);      // apple orange banana
				countItems.add(1);  // 1      1       1
			}
		}
		for(int i=0;i<unique.size();i++) {
			System.out.println(unique.get(i)+" : "+countItems.get(i));
		}
		
		
		

	}

}

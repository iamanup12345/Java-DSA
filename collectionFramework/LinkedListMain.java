package collectionFramework;
import java.util.*;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer> l1 = new LinkedList<>();
		 LinkedList<Integer> l2 = new LinkedList<>();
		 l2.add(2);
		 l2.add(12);
		 l2.add(13);
		 l2.add(10);
		 
		 l1.add(6);
		 l1.add(3);
		 l1.add(4);
		 l1.add(14);
		 l1.add(0, 5);
//		 l1.addAll(l2);
		 
		 System.out.println(l1.contains(4));
		 
		 System.out.println(l1.indexOf(20));
		 
		 System.out.println(l1.lastIndexOf(20));
		 
//		 l1.set(1,  566);
		 
//		 l1.remove(6);
		 
//		 l1.clear();
		 
//		 Collections.sort(l1);
		 
		 for(int i = 0; i<l1.size(); i++) {
			 System.out.print(l1.get(i));
			 System.out.print(", ");
		 }
	}

}


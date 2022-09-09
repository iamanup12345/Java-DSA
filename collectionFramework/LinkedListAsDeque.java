package collectionFramework;
	
import java.util.LinkedList;
import java.util.Deque;

public class LinkedListAsDeque {
	public static void main(String[] args) {
		    Deque<Integer> l1 = new LinkedList<>();

		    // add element at the beginning
		    l1.add(1);
		    System.out.println("LinkedList: " + l1);

		    l1.addFirst(2);
		    System.out.println("LinkedList after addFirst(): " + l1);

		    // add elements at the end
		    l1.addLast(3);
		    System.out.println("LinkedList after addLast(): " + l1);

		    // remove the first element
		    l1.removeFirst();
		    System.out.println("LinkedList after removeFirst(): " + l1);

		    // remove the last element
		    l1.removeLast();
		    System.out.println("LinkedList after removeLast(): " + l1);
	}

}

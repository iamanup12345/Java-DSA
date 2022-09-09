package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
	public static void main(String[] args) {
    Queue<Integer> l1 = new LinkedList<>();

    // add elements
    l1.add(6);
	l1.add(3);
	l1.add(4);
	l1.add(14);
    System.out.println("LinkedList: " + l1);

    // access the first element
    Integer str1 = l1.peek();
    System.out.println("Accessed Element: " + str1);

    // access and remove the first element
    Integer str2 = l1.poll();
    System.out.println("Removed Element: " + str2);
    System.out.println("LinkedList after poll(): " + l1);

    // add element at the end
    l1.offer(2);
    System.out.println("LinkedList after offer(): " + l1);
  }
}
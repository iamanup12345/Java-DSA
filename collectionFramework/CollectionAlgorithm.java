package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
      list.add(34);
      list.add(12);
      list.add(9);
      list.add(9);
      list.add(75);

      
      // Using reverse()
//      Collections.reverse(list);
//      System.out.println("Reversed ArrayList1: " + list);

      // Using swap()
//      Collections.swap(list, 0, 1);
//      System.out.println("ArrayList1 using swap(): " + list);

      // Using fill()
//      Collections.fill(list, 0);
//      System.out.println("ArrayList1 using fill(): " + list);

	// Using copy()
//      Collections.shuffle(list);
//      System.out.println("ArrayList using shuffle: " + list);
//      System.out.println("min element " + Collections.min(list));
//      System.out.println("max element " + Collections.max(list));
//      System.out.println(Collections.frequency(list, 9));

//      Collections.sort(list);
//      System.out.println(list);
//      Collections.sort(list, Comparator.reverseOrder());
//      System.out.println(list);
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(5);
      numbers.add(6);
      boolean value = Collections.disjoint(list, numbers);
      System.out.println("Two lists are disjoint: " + value);
	}
}

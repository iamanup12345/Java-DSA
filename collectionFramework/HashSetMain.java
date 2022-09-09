package collectionFramework;

import java.util.Set;
import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		set.add(2);
		set.add(32);
		set.add(13);
		set.add(66);
		set.add(23);
		set.add(22);
		set.add(22);
//		System.out.println("HashSet1: " + set);
//		System.out.println(set.remove(32));
//		System.out.println(set.contains(2));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		set.clear();
//		System.out.println(set);
		
        set1.add(2);
        set1.add(43);
//        System.out.println("HashSet2: " + set1);

        // Union of two set
//        set1.addAll(set);
//        System.out.println("Union is: " + set1);
        
       // Intersection of two sets
//        set1.retainAll(set);
//        System.out.println("Intersection is: " + set1);
        
       // Difference between HashSet1 and HashSet2
//        set1.removeAll(set);
//        System.out.println("Difference : " + set1);

       // Check if set1 is a subset of numbers
        boolean result = set1.containsAll(set);
        System.out.println("Is HashSet2 is subset of HashSet1? " + result);
	}
}

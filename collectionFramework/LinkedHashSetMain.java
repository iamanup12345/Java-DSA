package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<>();
		set.add(2);
		set.add(32);
		set.add(13);
		set.add(23);
		set.add(22);
		set.add(22);
		System.out.println(set);
		set.remove(32);
		System.out.println(set);
		System.out.println(set.contains(2));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}

}

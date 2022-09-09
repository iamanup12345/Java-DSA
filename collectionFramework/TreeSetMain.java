package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(32);
		set.add(13);
		set.add(66);
		set.add(22);
		set.add(22);
		System.out.println(set);
		System.out.println(set.contains(32));
		set.remove(32);
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}

}

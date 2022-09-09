package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> numbers = new TreeMap<>();
		numbers.put("One",1);
		numbers.put("Two",2);
		numbers.put("Three",3);
		if(!numbers.containsKey("Two")) {
			numbers.put("Three",23);
		}
		System.out.println(numbers);
		numbers.putIfAbsent("Two", 23);
		
	for (Map.Entry<String, Integer> e: numbers.entrySet()) {
      System.out.println(e);
      System.out.println(e.getKey());
      System.out.println(e.getValue());
	   }
	
	System.out.println(numbers.containsValue(3));
	System.out.println(numbers.isEmpty());
	
	numbers.remove("Three");
	System.out.println(numbers);
	}

}

package collectionFramework;

import java.util.Map;
import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("One",1);
		numbers.put("Two",2);
		numbers.put("Three",3);
		if(!numbers.containsKey("Two")) {
			numbers.put("Three",23);
		}
		System.out.println(numbers);
		numbers.putIfAbsent("Two", 23);

//		iterate through keys only
		System.out.print("Keys: ");
	    for (String key : numbers.keySet()) {
	      System.out.print(key);
	      System.out.print(", ");
	    }

	    // iterate through values only
	    System.out.print("\nValues: ");
	    for (Integer value : numbers.values()) {
	      System.out.print(value);
	      System.out.print(", ");
	    }
	    
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

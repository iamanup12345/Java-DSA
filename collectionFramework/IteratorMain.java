package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        Iterator<Integer> iterate = numbers.iterator();

        for(int i = 0; i< numbers.size(); i++) {
        	System.out.println("The element is : " + numbers.get(i));
        }
        
        for(Integer element: numbers) {
        	System.out.println("Foreach element is : " + element );        	
        }

        while(iterate.hasNext()) {
            System.out.println("Iterator : " + iterate.next());
        }
        
        while(iterate.hasNext()) {
        iterate.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}

package collectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Set;


		public class HashCodeMainAndEqualsMain {

		    public static void main(String[] args) {


//		    	Set<Student> studentSet = new HashSet<>();
//		        studentSet.add(new Student("Anuj", 2));
//		        studentSet.add(new Student("Rohit", 2));
//		        studentSet.add(new Student("Anup", 5));
//		        studentSet.add(new Student("Bibek", 1));
//		        
//		        Student s1 = new Student("Anuj", 2);
//		        Student s2 = new Student("Rohit", 2);
//		        
//		        System.out.println(s1.equals(s2));
//		        System.out.println(studentSet);

		    	
		    	
//		        List<Student> list = new ArrayList<>();
//
//		        list.add(new Student("Anuj", 2));
//		        list.add(new Student("Ramesh", 4));
//		        list.add(new Student("Shivam", 3));
//		        list.add(new Student("Rohit", 1));
//
//		        Student s1 = new Student("Anuj", 2);
//		        Student s2 = new Student("Rohit", 3);
//
////		     System.out.println((s1.compareTo(s2)));
//
//		        System.out.println(list);
//		        
//		        System.out.println(s1.compareTo(s2));
//		        Collections.sort(list);
//		        System.out.println(list);
		    	
		    	
		    	 List<Student> list = new ArrayList<>();
		    	 list.add(new Student("Anuj", 2));
		         list.add(new Student("Ramesh", 4));
		         list.add(new Student("Shivam", 3));
		         list.add(new Student("Rohit", 1));

		         Student s1 = new Student("Anuj", 2);
		         Student s2 = new Student("Rohit", 3);

//		         System.out.println((s1.compareTo(s2)));

		         System.out.println(list);

		         Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

		         System.out.println(list);

	}

}

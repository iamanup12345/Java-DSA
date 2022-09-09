package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumMain {
	 public static void main(String[] args) {
	  Vector<Integer> v = new Vector<Integer>();
	  v.add(10);
	  v.add(25);
	  v.add(50);
	  System.out.println(v);
	  Enumeration e = v.elements();
	  while(e.hasMoreElements()) {
	   System.out.println(e.nextElement()+" ");
	  }
	 }
	}

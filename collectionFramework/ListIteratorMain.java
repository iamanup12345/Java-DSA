package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorMain
{
    public static void main (String[]args)
    {
        LinkedList < Integer > ll = new LinkedList < Integer > ();
        ll.add (20);
        ll.add (10);
        ll.add (15);
        ll.add (75);
        System.out.println (ll);
        ListIterator < Integer > lit = ll.listIterator ();
       
        
        System.out.println ("Elements in Forward Direction");
        while (lit.hasNext ())
        {
         System.out.println (lit.next () + " ");
        }
        
        System.out.println ("\n elements in Backward direction");
        while (lit.hasPrevious ())
        {
         System.out.println (lit.previous () + " ");
        }
        while (lit.hasNext ())
        {
         Object o = lit.next ();
         Integer e = (Integer) o;
         if (e == 20)
         {
             lit.add (56);
         }
         if (e == 15)
         {
             lit.set (15000);
         }
         if (e == 10)
         {
             lit.remove ();
         }
        }
        System.out.println ("\n New List:" + ll);
    }
}
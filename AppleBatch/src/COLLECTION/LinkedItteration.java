package COLLECTION;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedItteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String>ll=new LinkedList<>();
     ll.add("apple");
     ll.add("mango");
     ll.add("banana");
     ll.add("orange");
     ll.add("grapes");
     
     System.out.println("nor loop");
     for(int i=0;i<ll.size();i++) {
    	 System.out.println(ll.get(i));
     }
     System.out.println("----------each for loop------");
     for(String s:ll) {
    	 System.out.println(s);
     }
     System.out.println("----iterator-----");
     Iterator<String>it=ll.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
     System.out.println("----listdlist uitterator");
     ListIterator<String>lit=ll.listIterator();
     while(lit.hasNext()) {          //forward
    	 System.out.println(lit.next());
     }
    System.out.println("-------backward-----");
     ListIterator<String>blit=ll.listIterator(ll.size());
     while(blit.hasPrevious()) {
    	 System.out.println(blit.hasPrevious());
    	 
     }
	}

}

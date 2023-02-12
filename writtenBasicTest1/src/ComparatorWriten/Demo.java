package ComparatorWriten;

import java.util.ArrayList;
import java.util.Iterator;


public class Demo {
  public static void main(String[] args) {
	  ArrayList<Integer>ll=new ArrayList<>();
	     ll.add(1);
	     ll.add(2);
	     ll.add(3);
	     ll.add(1);
	     ll.add(2);
	     ll.add(3);
	     ll.add(4);
	     ll.add(5);
	     ll.add(4);
	     ll.add(5);
	     ArrayList<Integer>al=new ArrayList<>();
	     
	     for(Integer i:ll) {
	    	 if(!al.contains(i)) {
	    		al.add(i); 
	    	 }
	     }
	      Iterator<Integer>it=al.iterator();
	      while(it.hasNext()) {
	    	  System.out.print(it.next()+" ");
	      }
  }
  
}

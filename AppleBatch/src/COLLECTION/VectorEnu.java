package COLLECTION;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<Integer>v=new Vector<>();
        v.add(10);
        v.add(10);
        v.add(20);
        v.add(10);
        v.add(30);
        v.add(10);
        v.add(40);
        v.add(50);
        
        System.out.println(v.capacity());
        System.out.println(v.contains(10));
        System.out.println(v.isEmpty());
        System.out.println(v.clone());
        System.out.println(v.lastIndexOf(v));
        
       Enumeration<Integer>e=v.elements(); // enumuration is thread safe & by default fail safe
       
       while(e.hasMoreElements() ) {
    	   if(e.nextElement()==10) {
    		  v.add(100);
    	   }
    	   
       }
       
       System.out.println(v);
       System.out.println();
	}

}

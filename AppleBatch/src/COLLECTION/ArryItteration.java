package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArryItteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer>a1=new ArrayList<>();

       a1.add(10);
       a1.add(20);
       a1.add(30);
       a1.add(40);
       a1.add(50);
       a1.add(60);
       a1.add(70);
       a1.add(80);
       a1.add(90);
       a1.add(100);
       
       // for normal method
       System.out.println("---------normal method--------");
       for(int i=0;i<a1.size();i++) {
    	   System.out.print(a1.get(i)+",");
    	  // System.out.println(a1.get(5));//special index element
       }
       
       // for each loop
       System.out.println();
       System.out.println("-----------for each loop--------");
       for(Integer i:a1) {
    	   System.out.print(i+",");
    	  // System.out.println(a1.get(5));
       }
       
       // for iterator method   //it is used for all collection it iterate only forward
       System.out.println();
       System.out.println("------itterater method-------");
      
       Iterator<Integer>it=a1.iterator();
       while(it.hasNext()) {
    	   System.out.print(it.next()+",");
       }
       System.out.println();
       // for Listiterator method // it can iterate forward and backward and it is used only arraylist and linkedlist
       
       System.out.println("--------list iterator method-------");
       System.out.println("----------forward-----------");
       System.out.println();
       ListIterator<Integer>flit=a1.listIterator(); 
       while(flit.hasNext()) {                      //forward
    	   System.out.print(flit.next()+",");
       }
       
       System.out.println();
       System.out.println("----------backward----------");
       System.out.println();
       ListIterator<Integer>blit=a1.listIterator(a1.size()); 
       while(blit.hasPrevious()) {                   //backword  
    	   System.out.print(blit.previous()+",");
       }
	}

}

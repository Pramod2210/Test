package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             LinkedList<Integer> a=new LinkedList<>();
             a.add(10);
             a.add(20);
             a.add(40);
             a.add(100);
         
         
             a.add(40);

             a.add(50);
             a.add(60);
             a.add(5);
             a.add(40);
             a.add(60);
             a.add(100);
             a.addFirst(1000);   // add first
             a.addLast(5000);  // add last
             System.out.println(a);
             
             Iterator<Integer>itr=a.descendingIterator(); // this method in linkd;ist only  
             while(itr.hasNext()) {
            	 System.out.print(itr.next()+",");
             }
             System.out.println();
             
             Collections.sort(a);  //assending order
             System.out.println(a);
          
             Collections.reverse(a);/// decending order first sort then reverse
             System.out.println(a);
             
         System.out.println(Collections.frequency(a, 40));   // occourance no
        
         int count=0;
         
         Iterator<Integer>it=a.iterator();
         while(it.hasNext()) {
        	 if(it.next()==40) {
        		 count++;
        	 }
         }
         System.out.println("count  "+count);
	
         System.out.println("***********");
         ArrayList<Integer>d=new ArrayList<>();        // no duplicate add 
         for(Integer i:a) {
        	 if(!d.contains(i)) {
        		 d.add(i);
        	 }
         }
         System.out.println(d);
         
         System.out.println("********delete------");
         for(int i=0;i<a.size();i++) {
        	 for(int j=i+1;j<a.size();j++) {
        		 if(a.get(i)==a.get(j)) {
        			 a.remove(j);
        		 }
        	 }
         }
         
         System.out.println(a);
       
   	 }
    }
	



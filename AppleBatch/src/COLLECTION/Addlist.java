package COLLECTION;

import java.util.ArrayList;

public class Addlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer>a=new ArrayList<>();
         a.add(1);
         a.add(2);
         a.add(3);
         a.add(4);
         a.add(5);
        
         ArrayList<Integer>a1=new ArrayList<>();
         a1.add(10);
         a1.add(20);
         a1.add(10);
         a1.add(40);
         a1.add(50);
       
         //a.addAll(a1);
        a.addAll(2, a1);
        // a.add(5, 60000);
       
        System.out.println(a.size());
        // a.removeAll(a1);
    
         System.out.println(a);
         a.remove(4);
         a.set(2, 555);
         a.retainAll(a1);
         System.out.println(a.lastIndexOf(a1));
         System.out.println(a);
         
         System.out.println(a.equals(a1));
         
         
      
	}

}

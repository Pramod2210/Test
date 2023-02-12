package MapAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question3 {
//3.	Write a Java program to get a set of keys contained in map and print whole map 
	//using iterator and for each loop.
	//
	//4.	Write a Java program to get a set of entries contained 
	//in map and print whole map using iterator and for each loop.  



	public static void main(String[] args) {
		// TODO Auto-generated method stub
           HashMap<Integer,String>hm=new HashMap<>();
           hm.put(10, "ten");
           hm.put(4, "four");
           hm.put(2, "two");
           hm.put(5, "five");
           hm.put(8, "eight");
           System.out.println(hm.keySet());
           System.out.println(hm.values());
             // using for loop
           for(Map.Entry<Integer,String>std:hm.entrySet()) {
        	   System.out.print(std+" ");
           }
           
           // 
           System.out.println("\n------******------");
           Iterator<Map.Entry<Integer,String>>it=hm.entrySet().iterator();
           while(it.hasNext()) {
        	   System.out.println(it.next());
           }
	}
}


package MapAssignment;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/*
There is a linked list which contains numbers from 1 to 5 . { 1,4,2,1,3,1,4} . 
Create a map which contains string which is number in words and number of times
that number has appeared in list? E.g. output map for above list will be map
		{ (“one”,3) ,(“two”,1),(“three” , 1),(“four”,2)}. Make use of switch 
		statement to get number in words.
*/

public class Switch14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<Integer>ll=new LinkedList<>();
      ll.add(1);
      ll.add(4);
      ll.add(2);
      ll.add(1);
      ll.add(3);
      ll.add(1);
      ll.add(4);
      
      LinkedHashMap<String,Integer>lm=new LinkedHashMap<>();
      
      for(Integer i:ll) {
    	  String name="";
    	  switch(i) {
    	  case 1:
    		  name="one";
    		  break;
    	  case 2:
    		  name="two";
    		  break;
    	  case 3:
    		  name="three";
    		  break;
    	  case 4:
    		  name="four";
    		  break;
    	  }
    	  if(lm.containsKey(name)) {
    		  lm.put(name,lm.get(name)+1);
    	  }
    	  else {
    		  lm.put(name, 1);
    	  }
      }
      System.out.println(lm);
      
	}

}

package ComparatorWriten;

import java.util.ArrayList;
import java.util.HashMap;

public class Question3hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al=new ArrayList<>();
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");
		
   HashMap<String,Integer>hm=new HashMap<>();
      for(String s:al) {
    	 if(hm.containsKey(s)) {
    		 int i=hm.get(s);
    		 hm.put(s, i+1);
    	 }
    	 else {
    		 hm.put(s, 1);
    	 }
      }
      System.out.println(hm);
	}

}

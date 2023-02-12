package MapAssignment;

import java.util.ArrayList;
import java.util.HashMap;
//Create HashMap which contain String as key and Integer as value key is name of city and value is frequency of that city;
//e.g m.put("pune",3);
//m.put("Mumbai",2);
//Print Map using Foreach loop.

public class Frequency {

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
		  hm.put(s,hm.get(s)+1);
	  }
	  else {
		  hm.put(s, 1);
	  }
  }
      System.out.println(hm);
	}

}

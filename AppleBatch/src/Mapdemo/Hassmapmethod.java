package Mapdemo;

import java.util.HashMap;

public class Hassmapmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer,String>hm=new HashMap<>();
   
   hm.put(1, "pramod");
   hm.put(2, "pravin");
   hm.put(105, "raj");
   hm.put(98, "ravan");
   hm.put(78, "aditya");
   hm.put(56, "akasha");
   System.out.println(hm);
   
   HashMap<Integer,String>hm1=new HashMap<>(hm);
   System.out.println(hm1);
  /* System.out.println(hm.isEmpty());
   System.out.println(hm.size());
   System.out.println(hm.remove(105));
   System.out.println();
  
   
   HashMap<Integer,String>hm1=new HashMap<>();
   hm1.put(10,"rani");
   
   hm.putAll(hm1);
   System.out.println(hm);
   
   System.out.println(hm);
   System.out.println(hm.replace(2," geeta"));
   System.out.println(hm);
 //  hm.clear();
 //  System.out.println(hm);
	}*/

	}
}

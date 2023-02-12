package Mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n*****hashmap*********-");
      HashMap<Integer,String>hm=new HashMap<>();  // random order
      hm.put(1, "pramod");
      hm.put(2, "pravin");
      hm.put(105, "raj");
      hm.put(98, "ravan");
      hm.put(78, "aditya");
      hm.put(56, "akasha");
      
      System.out.println(hm);
      
      System.out.println("\n*****hashlnk*********-");
      LinkedHashMap<Integer,String>hl=new LinkedHashMap<>(); /// maintain insertion order
      
      hl.put(1, "pramod");
      hl.put(2, "pravin");
      hl.put(105, "raj");
      hl.put(98, "ravan");
      hl.put(78, "aditya");
      hl.put(56, "akasha");
      
      System.out.println(hl);
      System.out.println("\n************---- Treemap******------");
      TreeMap<Integer,String>tm=new TreeMap<>();// set in assinding order of key value 
      tm.put(1, "pramod"); 
      tm.put(2, "pravin");
      tm.put(105, "raj");
      tm.put(98, "ravan");
      tm.put(78, "aditya");
      tm.put(56, "akasha");
      
      System.out.println(tm);
	}

}

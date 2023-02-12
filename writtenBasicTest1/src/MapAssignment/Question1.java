package MapAssignment;

import java.util.LinkedHashMap;

public class Question1 {
	//1.	Write a Java program to test if a map contains a mapping for the 
	//specified value and also test if a map contains a mapping for the specified key.
	//2.	Write a Java program to get the value of a specified key in a map.
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<String,Integer>lh=new LinkedHashMap<>();
	       lh.put("pramod", 10);
	       lh.put("ram", 100);
	       lh.put("priti", 50);
	       lh.put("raju", 5);
	       lh.put("rani", 7);
	       
	    System.out.println(lh.containsKey("pramod"));
	    System.out.println(lh.containsValue(50));
	    System.out.println(lh.get("pramod"));
	}

}

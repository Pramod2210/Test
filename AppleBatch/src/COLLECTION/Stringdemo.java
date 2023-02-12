package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String>a=new ArrayList<>();
      a.add("peek");
      a.add("seek");
      a.add("beak");
      a.add("veer");
      a.add("tree");
      
      Iterator<String>it=a.iterator();
      while(it.hasNext()) {
    	  String s=it.next();
    	  if(s.contains("ee")) {
    		  System.out.println(s);
    	  }
      }
	}

}

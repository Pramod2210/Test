package MapPractice;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Setdemp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<Integer>v=new Vector<>();
      v.add(20);
      v.add(50);
      v.add(30);
      v.add(40);
      v.add(22);
      v.add(25);
      Enumeration<Integer>it=v.elements();
      while(it.hasMoreElements()) {
    	 if(it.nextElement()==20)
    	  v.add(100);
      }
      System.out.println(v);
	}

}

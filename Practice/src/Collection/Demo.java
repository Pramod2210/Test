package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer>a=new ArrayList<>();
      a.add(10);
      a.add(20);
      a.add(30);
      a.add(2, 40);
    //  System.out.println(a);
      for(int i=0;i<a.size();i++) {
    	  System.out.println(a.get(i));
      }
      
      System.out.println("***********-----------**********");
      for(Integer x:a) {     
    	  System.out.println(x);
      }
      
      System.out.println("**iterratot8999999999999********");
      Iterator<Integer>it=a.iterator();
      while(it.hasNext()) {
    	if(it.next()==10) {
    		a.add(10);
    		System.out.println(it.next());
    	}
      }
      
      LinkedList<Integer>x=new LinkedList<>();
      
	}

}

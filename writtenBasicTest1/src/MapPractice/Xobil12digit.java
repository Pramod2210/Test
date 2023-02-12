package MapPractice;

import java.util.ArrayList;

public class Xobil12digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer>a=new ArrayList<>();
      a.add(10);
      a.add(1);
      a.add(1);
      a.add(90);
      a.add(88);
      a.add(5);
      a.add(85);
      a.add(4);
      
      for(Integer i:a) {
    	  if(i>=10 && i<=99) {
    		  System.out.println(i);
    	  }
      }
	}

}

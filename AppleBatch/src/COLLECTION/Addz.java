package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class Addz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<Character>a=new ArrayList<>();
		     a.add('a');
		     a.add('b');
		     a.add('c');
		     a.add('d');
		     a.add('a');
		     a.add('b');
		     a.add('c');
		     a.add('c');
		     
		     
		     for(int i=0;i<a.size();i++) {
		    	 if(a.get(i)=='a') {
		    		 a.add(i+1, 'z'); 
		    	 }
		     }
		     System.out.println(a);
		     
		 
	}

}

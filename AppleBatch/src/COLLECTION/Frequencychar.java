package COLLECTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Frequencychar {

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
     
     /*Iterator<Character>it=a.iterator();
     while(it.hasNext()) {
    	 System.out.println(Collections.frequency(a, it.next()));
     }*/
     
     for(int i=0;i<a.size();i++) {
    	 int count=1;
    	
    	 for(int j=i+1;j<a.size();j++) {
    		
    		 if(a.get(i)==a.get(j)) {
    			a.set(j, ' ');
    			 count++;
    		 }
    		 
    	 }
    	 
     
    	 if(a.get(i)!=' ') {
    	 System.out.println(count);
	}
	}
}
}

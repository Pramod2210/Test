package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class DeleteChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Character>a=new ArrayList<>();
     a.add('d');
     a.add('g');
     a.add('h');
     a.add('d');
     a.add('d');
     a.add('h');
     a.add('d');
     ArrayList<Character>a1=new ArrayList<>();
   System.out.println(a);
    Iterator<Character>it=a.iterator();
    while(it.hasNext()) {
   	 char ch=it.next();
  	 if(!a1.contains(ch)) {
    		a1.add(ch);
    	 }
    }
    System.out.println(a1);
	}    
     
	
}

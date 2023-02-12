package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>al=new ArrayList<>();
    al.add(10);
    al.add(10);
    al.add(30);
    al.add(40);
    System.out.println(al);
    Iterator<Integer>it=al.iterator();
    while(it.hasNext()) {
    	if(it.next()==10) {
    	al.add(100);
    }
    }
    System.out.println(al);
	}

}

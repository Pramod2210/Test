package vithamas;

import java.util.ArrayList;

public class UncommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
    ArrayList<Integer>a=new ArrayList<>();
    ArrayList<Integer>b=new ArrayList<>();
    a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    
    b.add(40);
    b.add(30);
    b.add(50);
    b.add(60);
    
    a.addAll(b);
    ArrayList<Integer>c=new ArrayList<>();
    for(Integer i:a) {
    	if(!c.contains(i)) {
    		c.add(i);
    	}
    }
    System.out.println(c);
    	}
 
}

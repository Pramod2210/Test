package ArraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;
//4.	WAP to print all elements of ArrayList using iterator
//5.	WAP to iterate through all elements in an ArrayList using for loop
//6.	WAP to iterate through all elements in an ArrayList using for each

public class Iteraormethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>a1=new ArrayList<>();
    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(40);
    a1.add(50);
     
    System.out.println("----------using iterator method------");
    Iterator i=a1.iterator();
    while(i.hasNext()) {
    	System.out.print(i.next()+",");
    }
    System.out.println("\n-------------using forloop----------");
    for(int j=0;j<a1.size();j++) {
    	System.out.print(a1.get(j)+",");
    }
    System.out.println("\n----------using for each loop");
    for(Integer i1:a1) {
    	System.out.print(i1+",");
    }
	}

}

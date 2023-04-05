package ArraylistAssignment;

import java.util.ArrayList;
//8.	WAP to remove element from ArrayList
//9.	WAP to remove all elements from ArrayList
//10.	WAP to retain all elements from ArrayList
//11.	WAP to know how many elements in ArrayList

public class Removelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer>a=new ArrayList<>();
     a.add(10);
     a.add(20);
     a.add(30);
     a.add(40);
     a.add(50);
     a.add(60);
     
     System.out.println(a);
    a.remove(4);
     System.out.println(a);
     a.retainAll(a);
    a.removeAll(a);
     System.out.println(a);
     System.out.println(a.size());
   
     
	}

}

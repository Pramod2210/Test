package ArraylistAssignment;

import java.util.ArrayList;
//14.	WAP to search an element from ArrayList
//15.	WAP to search the specified collection in this collection
//16.	WAP to retrieve an element (at a specified index) from a given ArrayList
//17.	WAP to insert an element into the ArrayList at the first position

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer>a=new ArrayList<>();
        a.add(10);
        a.add(100);
        a.add(60);
        a.add(40);
        a.add(30);
        a.add(20);
        a.add(0, 456);
        a.add(2,50);
        System.out.println(a);
        System.out.println(a.contains(60));
        
	}

}

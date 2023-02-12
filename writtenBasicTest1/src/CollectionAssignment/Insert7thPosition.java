package CollectionAssignment;

import java.util.ArrayList;

public class Insert7thPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer>al=new ArrayList<>();
   al.add(1);
   al.add(2);
   al.add(3);
   al.add(4);
   al.add(5);
   al.add(6);
   al.add(7);
   al.add(8);
   al.add(9);
   al.add(10);
   
   System.out.println(al);
   
   al.add(7, 500);
   System.out.println(al);
	}

}

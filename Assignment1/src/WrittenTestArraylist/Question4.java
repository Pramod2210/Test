package WrittenTestArraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<Integer>a=new LinkedList<>();
     a.add(10);
     a.add(20);
     a.add(30);
     a.add(40);
     a.add(50);
     
     
    ListIterator<Integer>lit=a.listIterator(a.size());{
    	while(lit.hasPrevious()) {
    		System.out.println(lit.previous());
    	}
    }
	}

}

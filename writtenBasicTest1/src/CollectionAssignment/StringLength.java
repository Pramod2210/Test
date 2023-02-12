package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String>al=new ArrayList<>();
   al.add("sunday");
   al.add("monday");
   al.add("tuesday");
   al.add("wednesday");
   al.add("thurday");
   al.add("friday");
   al.add("saturday");
   
   
	Iterator<String>it=al.iterator() ;
	while(it.hasNext()) {
		if(it.next().length()>7) {
			it.remove();
		}
	}
   System.out.println(al);
	}

}

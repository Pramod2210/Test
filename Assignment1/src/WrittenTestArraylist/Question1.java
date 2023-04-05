package WrittenTestArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) {
   ArrayList<String> al = new ArrayList<String>();
   al.add("Sun");
   al.add("Mon");
   al.add("Sat");
   al.add("Sun ");
   al.add("Mon ");
   al.add("Sat ");
   al.add("Sun ");
   al.add("Sat ");
   al.add("Sun ");
   al.add("Mon ");
   
   for(int i=0;i<al.size();i++) {
	   if(al.get(i)!="0"){
		   int count=0;
	   for(int j=i+1;j<al.size();j++) {
		   
		   if(al.get(i).equalsIgnoreCase(al.get(j))) {
			      if(count==0) {
			   System.out.println(al.get(j));
			   al.set(j, "0");
			   count++;
		   }
	   }
	   }
   }
   }
	}

}

package CollectionAssignment;

import java.util.ArrayList;

public class AddFIrst50ODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		
		// this method  for static method  means hardcode
		 for(int i=1;i<=100;i++) {
			 if(i%2!=0) {
	    	 al.add(i);
	     }
		 }
	     System.out.println(al);
	     System.out.println(al.size());
		
		
	// this method for dynamic we can add 50 60 70 75 any size 
			for(int i=1;i>=1;i++) {
				if(al.size()<50) {
				 if(i%2!=0) {
		    	 al.add(i);
		     }
			 }
		}
		System.out.println(al);
	}
	
	}



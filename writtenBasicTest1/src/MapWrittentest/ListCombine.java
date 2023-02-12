package MapWrittentest;

import java.util.LinkedList;

public class ListCombine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer>a=new LinkedList<>();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(4);
      a.add(5);
    a.add(6);
       
       LinkedList<Integer>b=new LinkedList<>();
         b.add(11);
         b.add(22);
         b.add(33);
         b.add(44);
         
      
   
			 LinkedList<Integer>c=new LinkedList<>(); 
			 for(int i=0;i<a.size();i++) {
				 if(i<a.size() && i<b.size()) {
					 c.add(a.get(i));
					 c.add(b.get(i));
						 
					 
				 }
				 else if(i<a.size()) {
					 
					 c.add(a.get(i));
				 }
			 }
			 System.out.println(c);
			 
			 
			 
	}
}
			 
			/* int x=a.size()+b.size();  
			 for(int i=0;i<a.size();i++) {
				// if(i<b.size()) {
				// if(i%2==0) {
				 c.add(a.get(i));
					 
				 }
			 System.out.println(c);
					
					 * if(i%2==1) { c.add(b.get(i)); } } else { c.add(a.get(i)); }
					 * System.out.println(c);
					 * 
					 * }
					 
			 for(int i=0;i<c.size();i++) {
				 if(i<b.size()) {
				 if(i%2==1) {
					 c.add(i,b.get(i));
				 }
			 }
			 }
			 System.out.println(c);
	}
}  
*/
         
         
         
         
         
         
         
         
         
     /*    for(int i=1;i<=11;i++) {
        	 if(i%2==0) {
        		for(Integer x:a) {
        			c.add(x);
        			break;
        		}
        	 }
        	 else {
        		 for(Integer y:b) {
         			c.add(y);
         			break;
         		}
        	 }
         }
         System.out.println(c);
	}
*/

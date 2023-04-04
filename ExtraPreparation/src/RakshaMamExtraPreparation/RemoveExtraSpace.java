package RakshaMamExtraPreparation;

import java.util.Arrays;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Decaan    logic ";
    int count=0;
    char ch[]=s.toCharArray();
    String s5[]=s.split(" ");
    String name="";
     /*for(int i=0;i<s5.length;i++) {
    	 if(s5[i].equals(" ")) {
    	    continue;
    	 }
    	 else {
    			name = name+s5[i]+"@";
    	 }
    	 if(!s5[i].equals(" ")) {
    		 name = name+s5[i]+" ";
    	 }
     }
     System.out.println(name);
   System.out.println(Arrays.toString(s5));*/
    
    
    
    
    
    
      String s1="";
      
      for(int i=0;i<ch.length;i++) {  //i=0 v i=8 i=9  i=10
    	
    	  if(ch[i]!=' ') { 
    		  
    		 s1=s1+ch[i] ;  //s1=vithamas
    		 count=0;     // count =0;
    	  }
    	  else {
    		  if(count==0) {
    		  s1=s1+ch[i] ;   // " "
    		  
    		  count++;     // count =1;
    	  }
    	  }
      }
    		
      System.out.println(s1);
	}

}

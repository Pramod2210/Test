package Test3;

import java.util.Arrays;

public class RemoveExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Decaan  logic ";
    int count=0;
    char ch[]=s.toCharArray();
    //String s5[]=s.split(" ");
    String s1="";
    
  
      for(int i=0;i<ch.length;i++) {  //i=0 v i=8 i=9  i=10
    	
    	  if(ch[i]!=' ') { 
    		  
    		 s1=s1+ch[i] ; 
    		 count=0;     
    	  }
    	  else {
    		  if(count==0) {
    		  s1=s1+ch[i] ;   
    		  
    		  count++;     
    	  }
    	  }
      }
      System.out.println(s1);
      
	}

}

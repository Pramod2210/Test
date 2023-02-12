package StringWrittenStore;

import java.util.Arrays;

public class AddionosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="KITE";
     int sum=0;
     char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i++) {
    	 int j=ch[i]-64;
    	 sum=sum+(ch[i]-64); 
    	 System.out.println(ch[i]+":"+j);
     }
     System.out.println(sum);
   
    /*  String s="THE SKY IS THE LIMIT";
      String s1[]=s.split(" ");
     System.out.println(Arrays.toString(s1));
      for(int i=0;i<s1.length;i++) {
    	  int sum=0;
    	
    	  char ch[]=s1[i].toCharArray();
    	  for(int j=0;j<ch.length;j++) {
    		 
    		 sum=sum+(ch[j]-64) ;
    	  }
    	  
    	  System.out.println(s1[i]+": "+sum);
      }*/
     
	}

}

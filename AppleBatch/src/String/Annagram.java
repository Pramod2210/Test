package String;

import java.util.Arrays;

public class Annagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="hello";
        String s1="alleh";
        
         if(s.length()==s1.length()) {
        char a[]=s.toCharArray();
        char b[]=s1.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
       int flag=0;
       for(int i=0;i<a.length;i++) {
    	   if (a[i]!=b[i]) {
    		   flag++;
    		   break;
    	   }
    	   }
       
       
    	   if(flag==0) {
    		   System.out.println("is anagram");
    	   }
    	   else {
    		   System.out.println("not anagram");
    	   }
       }
        
	
         else {
        	 System.out.println("not anagram");
         }
	}
}

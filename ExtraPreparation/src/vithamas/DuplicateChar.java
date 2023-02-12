package vithamas;
//Write a program to print the count of duplicate characters in a given string.
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="adcadg";
      int count=0;
       char ch[]=s.toCharArray();
       for(int i=0;i<ch.length;i++) {
    	   for(int j=i+1;j<ch.length;j++) {
    		   if(ch[i]==ch[j]) {
    			 count++;  
    		   }
    	   }
       }
       System.out.println(count);
    		  
	}

}

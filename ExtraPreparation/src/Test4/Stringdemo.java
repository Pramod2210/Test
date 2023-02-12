package Test4;

import java.util.Arrays;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="atif";
   char a[]=s.toCharArray(); // 
   
     System.out.println(s.charAt(1));
     
     String b="Atif is good boy";
     char ch[]=b.toCharArray();
     
     String s1[]=b.split(" ");
     System.out.println(Arrays.toString(ch));
     System.out.println(Arrays.toString(s1));
     
      String s5="1234";
      int j=Integer.parseInt(s5);
      // int i=j*4;
       
       int []a1= new int[100];
       
       
       String d[]= {"pramodei"};
       
       int count=0;
       for(int i=0;i<d.length;i++) {
    	   char x[]=d[i].toCharArray();
    	   for(int k=0;k<d[i].length();k++) {
    		   //if(count<2) {
    		   if(x[k]=='a'||x[k]=='o') {
    			   System.out.println(x[k]); 
    			   count++;
    		   } 
    	   }
    		   /*else {
    			   break;
    		   }*/
    	   
    	   
       }
       
	}
	}





import java.util.Arrays;
import java.util.Scanner;
	public class demo {
	
		public static void main(String args[])
	    {
	       
	        //********* START: PLEASE DO NOT CHANGE ANY CODE LINES GIVEN BELOW
	       //DO NOT WRITE ANY EXTRA PRINT or SCAN STATEMENT
	        // ***************** END: UNTIL THIS LINE
	        
	     String s;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("enter string");
	      s=sc.nextLine();
	   String s1[]=s.split(" ");
	   System.out.println(Arrays.toString(s1));
	 
	  for(int i=0;i<s1.length;i++){
	    for(int j=i+1;j<s1.length;j++)  {
	    
	     if(s1[i].equals(s1[j])){
	    	
	        System.out.println(s1[i]+" ");
	      }
	    }
	  }

	    }

	}


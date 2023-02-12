package WrittenTest2;

import java.util.Scanner;

public class main {

	
			public static void main(String args[])
		    {
		       
		        //********* START: PLEASE DO NOT CHANGE ANY CODE LINES GIVEN BELOW
		       //DO NOT WRITE ANY EXTRA PRINT or SCAN STATEMENT
		      String s=" Java is a good Programming language";
		      int count=0;
		      char ch;
		      System.out.println("hi");
		       Scanner sc= new Scanner(System.in);
		       System.out.println("enter");
		      ch=sc.next().charAt(0);
		        
		       char  ch1[]=s.toCharArray();
		        // ***************** END: UNTIL THIS LINE
		     
		       // START: WRITE YOUR LOGIC BELOW THIS STATEMENT
		    	for(int i=0;i<ch1.length;i++)
		      {
		        if(ch1[i]==ch){
		          count++;
		        }
		      }
		      	// END: WRITE YOUR LOGIC ABOVE THIS STATEMENT
		      System.out.println(ch+" "+count);
		    }

		
	}



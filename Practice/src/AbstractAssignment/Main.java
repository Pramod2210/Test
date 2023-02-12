package AbstractAssignment;

import java.util.Scanner;

public class Main {


	public static void main(String args[])
    {
       
        //********* START: PLEASE DO NOT CHANGE ANY CODE LINES GIVEN BELOW
       //DO NOT WRITE ANY EXTRA PRINT or SCAN STATEMENT
       int sum=0;

        int arr[]=new int [5];
       Scanner sc= new Scanner(System.in);
       
       for(int i=0;i<arr.length;i++)
      {
    	   System.out.println("enter");
           arr[i]=sc.nextInt();
      }
        
       
        // ***************** END: UNTIL THIS LINE
     
       // START: WRITE YOUR LOGIC BELOW THIS STATEMENT
    	
    for(int j=0;j<arr.length;j++){
      sum=sum+arr[j];
    }
    
    
    		
      	// END: WRITE YOUR LOGIC ABOVE THIS STATEMENT
      System.out.println(sum);
    }

}

